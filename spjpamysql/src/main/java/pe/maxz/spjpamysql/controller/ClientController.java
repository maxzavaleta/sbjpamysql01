package pe.maxz.spjpamysql.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.MappedSuperclass;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.maxz.spjpamysql.exception.ClientNotFoundException;
import pe.maxz.spjpamysql.model.Client;
import pe.maxz.spjpamysql.repository.ClientRepository;

@Controller
@RestController
@RequestMapping("/clients")
public class ClientController {
	@Autowired
	ClientRepository clientRepository;

	@GetMapping("")
	public List<Client> getAll(){
		return clientRepository.findAll();
	}
	@PostMapping("")
	public Client add (@Valid @RequestBody Client client) {
		return clientRepository.save(client);
	
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) throws ClientNotFoundException {
		Client client = clientRepository.findById(id)
				.orElseThrow(() -> new  ClientNotFoundException(id) );
		clientRepository.delete(client);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public Client update(@PathVariable(value = "id") Long id, @Valid @RequestBody Client client) throws ClientNotFoundException {
		Client clientTemp = clientRepository.findById(id)
				.orElseThrow(() -> new  ClientNotFoundException(id) );
		clientTemp.setLast_name(client.getName());
		clientTemp.setLast_name(client.getLast_name());
		return clientRepository.save(clientTemp);
		
	}
	
	
	
}
