package br.eti.gregori.repository;

import br.eti.gregori.model.UserPermission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by encef on 17/12/2016.
 */
public interface UserPermissionRepository extends JpaRepository<UserPermission, Long> {
}
