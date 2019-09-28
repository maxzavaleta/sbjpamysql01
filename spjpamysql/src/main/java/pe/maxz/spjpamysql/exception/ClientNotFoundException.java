package pe.maxz.spjpamysql.exception;

public class ClientNotFoundException extends Exception{
	/**
	 * 
	 */
	private Long id;
	public ClientNotFoundException(Long id) {
	        super(String.format("Client is not found with id : '%s'", id));
	        }
}
