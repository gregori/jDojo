package br.eti.gregori.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by encef on 16/12/2016.
 */
@Data
@Entity
//@EntityListeners(AuditingEntityListener.class)
public class User extends BaseEntity {
    private @Id @GeneratedValue Long id;

    private int register;
    private String name;
    private Date dob;
    private Long cpf;
    private Long rg;
    private String email;
    @OneToMany(mappedBy = "user")
    private Set<UserPermission> userPermission;
}
