package br.eti.gregori.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by encef on 16/12/2016.
 */
@Data
@Entity
//@EntityListeners(AuditingEntityListener.class)
public class UserPermission extends BaseEntity {
    private @Id @GeneratedValue Long id;
    private @ManyToOne User user;
    private @ManyToOne Permission permission;
    private String verb;
}
