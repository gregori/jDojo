package br.eti.gregori.repository;

import br.eti.gregori.model.Dojo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by encef on 17/12/2016.
 */
public interface DojoRepository extends JpaRepository<Dojo, Long> {
}
