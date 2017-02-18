package br.eti.gregori.repository;

import java.util.List;
import br.eti.gregori.model.User;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by encef on 16/12/2016.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findByRegister(@Param("register") Long register);
    
    @Query(value = "SELECT * from user u WHERE u.register = :register AND u.active = true",
    		nativeQuery=true)
    public List<User> findByRegisterActiveUser(@Param("register") Long register);
    
}
