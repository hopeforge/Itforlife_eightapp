package br.com.indra.graaccapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.indra.graaccapp.entity.Adocao;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface AdocaoRepository extends CrudRepository<Adocao, Long> {

	@Query(value="SELECT * FROM adocao where adocao.name= ?1",nativeQuery = true)
	Adocao findUserByName(@Param("name") String name);
	
	@Query(value="SELECT * FROM adocao  where adocao.data= ?1",nativeQuery = true)
	Adocao findUserByDate(@Param("data") String data);
	
	@Query(value="SELECT * FROM adocao  where adocao.valor= ?1",nativeQuery = true)
	Adocao findUserByValue(@Param("valor") String valor);
}
