package br.com.indra.graaccapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.indra.graaccapp.entity.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	@Query(value="SELECT * FROM user  where user.email = ?1",nativeQuery = true)
    User findUserByEmail(@Param("email") String email);
}
