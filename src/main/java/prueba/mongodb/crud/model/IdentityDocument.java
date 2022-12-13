package prueba.mongodb.crud.model;

import org.springframework.data.annotation.Id;


@org.springframework.data.mongodb.core.mapping.Document
public class IdentityDocument {
	
	@Id
	String id;
	Document identityDocument;
	
	
	
	public IdentityDocument() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IdentityDocument(String id, Document identityDocument) {
		super();
		this.id = id;
		this.identityDocument = identityDocument;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Document getIdentityDocument() {
		return identityDocument;
	}
	public void setIdentityDocument(Document identityDocument) {
		this.identityDocument = identityDocument;
	}
	
	
}
