package br.com.indra.graaccapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.indra.graaccapp.entity.Doador;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface DoadorRepository extends CrudRepository<Doador, Long> {

	@Query(value="SELECT * FROM doador where doador.name= ?1",nativeQuery = true)
	Doador findUserByName(@Param("name") String name);
	
	@Query(value="SELECT * FROM doador  where doador.nomeFantasia= ?1",nativeQuery = true)
	Doador findUserByDate(@Param("nomeFantasia") String nomeFantasia);
}
