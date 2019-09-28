package pe.maxz.spjpamysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name = "clients")
public class Client {
	@Id
	@GeneratedValue
	private Long id;
	@NotBlank
	private String name;
	@NotBlank
	private String last_name;
	
	public Client() {
		super();
	}

	public Client(Long id, String name, String last_name) {
		super();
		this.id=id;
		this.name=name;
		this.last_name=last_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
}
