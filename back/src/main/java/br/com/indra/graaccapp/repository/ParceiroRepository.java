package br.com.indra.graaccapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.indra.graaccapp.entity.Parceiro;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface ParceiroRepository extends CrudRepository<Parceiro, Long> {

	@Query(value="SELECT * FROM parceiro where parceiro.name= ?1",nativeQuery = true)
	Parceiro findUserByName(@Param("name") String name);
	
	@Query(value="SELECT * FROM parceiro where parceiro.tipo= ?1",nativeQuery = true)
	Parceiro findUserByTipo(@Param("tipo") String tipo);
}
