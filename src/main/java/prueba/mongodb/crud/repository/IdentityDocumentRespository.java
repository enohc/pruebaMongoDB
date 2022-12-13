package prueba.mongodb.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import prueba.mongodb.crud.model.IdentityDocument;

public interface IdentityDocumentRespository extends MongoRepository<IdentityDocument, String>{

}
