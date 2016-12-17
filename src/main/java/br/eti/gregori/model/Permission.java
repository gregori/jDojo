package br.eti.gregori.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by encef on 16/12/2016.
 */
@Data
@Entity
//@EntityListeners(AuditingEntityListener.class)
public class Permission extends BaseEntity {
    private @Id @GeneratedValue Long id;
    private String route;
    @OneToMany(mappedBy = "permission")
    private Set<UserPermission> userPermission;
}
