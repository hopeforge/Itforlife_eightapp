package br.com.indra.graaccapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.indra.graaccapp.entity.Evento;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface EventoRepository extends CrudRepository<Evento, Long> {

	@Query(value="SELECT * FROM evento where evento.name= ?1",nativeQuery = true)
	Evento findUserByName(@Param("name") String name);
	
	@Query(value="SELECT * FROM evento  where evento.date= ?1",nativeQuery = true)
	Evento findUserByDate(@Param("date") String date);
}
