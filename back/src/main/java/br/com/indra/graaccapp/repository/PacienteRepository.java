package br.com.indra.graaccapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.indra.graaccapp.entity.Paciente;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long> {

	@Query(value="SELECT * FROM paciente  where paciente.name= ?1",nativeQuery = true)
    Paciente findUserByName(@Param("name") String name);
}
