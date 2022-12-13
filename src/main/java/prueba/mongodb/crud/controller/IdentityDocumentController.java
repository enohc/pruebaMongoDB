package prueba.mongodb.crud.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import prueba.mongodb.crud.model.Document;
import prueba.mongodb.crud.model.DocumentType;
import prueba.mongodb.crud.model.IdentityDocument;
import prueba.mongodb.crud.repository.IdentityDocumentRespository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class IdentityDocumentController {

	@Autowired
	private IdentityDocumentRespository repo;
	
	@GetMapping("")
	List<IdentityDocument> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("{id}")
	IdentityDocument getOne(@PathVariable String id) {
		 //return new IdentityDocument( "id", new Document(123L,"09/22",new Date(), new DocumentType("CI","Cedula")));
		return repo.findById(id).orElseThrow(RuntimeException::new);
	}
	
	@PostMapping(path = "",consumes = {"application/json"})
	@ResponseStatus(HttpStatus.CREATED)
	IdentityDocument create(@RequestBody IdentityDocument identityDocument) {
		
		
		return repo.save(identityDocument);
	}

	@PutMapping(path = "{id}",consumes = {"application/json"})
	@ResponseStatus(HttpStatus.ACCEPTED)
	IdentityDocument update(@PathVariable String id,@RequestBody IdentityDocument newValues) {
		IdentityDocument document = getOne(id);
		
		//Por efectos de tiempo no se agrega validacion de campos nullos o en blanco que puedan 
		//sobre escribir el documento.
		
		document.setIdentityDocument(newValues.getIdentityDocument());
		
		return repo.save(document);
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)	
	void delete(@PathVariable String id) {
		IdentityDocument document = getOne(id);
		repo.delete(document);
	}
	
	
	
}
