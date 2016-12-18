package br.eti.gregori.repository;

import br.eti.gregori.model.Presence;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by encef on 18/12/2016.
 */
public interface PresenceRepository extends JpaRepository<Presence, Long> {
}
