package pe.maxz.spjpamysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.maxz.spjpamysql.model.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
