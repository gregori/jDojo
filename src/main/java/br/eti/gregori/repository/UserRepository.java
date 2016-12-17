package br.eti.gregori.repository;

import br.eti.gregori.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by encef on 16/12/2016.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
