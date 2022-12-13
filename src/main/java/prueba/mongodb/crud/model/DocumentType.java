package prueba.mongodb.crud.model;

public class DocumentType {
	String code;
	String name;
	
	
	public DocumentType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentType(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
