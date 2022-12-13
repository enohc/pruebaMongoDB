package prueba.mongodb.crud.model;

import java.util.Date;

public class Document {
	Long number;
	String expiryDate;
	Date emisionDate;
	DocumentType documentType;
	
	public Document() {
		super();
	}
	
	public Document(Long number, String expiryDate, Date emisionDate, DocumentType documentType) {
		super();
		this.number = number;
		this.expiryDate = expiryDate;
		this.emisionDate = emisionDate;
		this.documentType = documentType;
	}

	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Date getEmisionDate() {
		return emisionDate;
	}
	public void setEmisionDate(Date emisionDate) {
		this.emisionDate = emisionDate;
	}
	public DocumentType getDocumentType() {
		return documentType;
	}
	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}
	
	
	
}
