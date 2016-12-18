package br.eti.gregori.repository;

import br.eti.gregori.model.Belt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by encef on 18/12/2016.
 */
public interface BeltRepository extends JpaRepository<Belt, Long> {
}
