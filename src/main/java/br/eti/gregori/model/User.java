package br.eti.gregori.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

/**
 * Created by encef on 16/12/2016.
 */
@Data
@Entity
//@EntityListeners(AuditingEntityListener.class)
public class User {
    private @Id @GeneratedValue Long id;

    private int register;
    private String name;
    private Date dob;
    private Long cpf;
    private Long rg;
    private String email;
    @OneToMany(mappedBy = "user")
    private Set<UserPermission> userPermission;

    @ManyToOne
    private Dojo dojo;

    private @CreatedDate LocalDateTime createdDate;
    private @LastModifiedDate LocalDateTime lastModifiedDate;

    private @CreatedBy String createdBy;
    private @LastModifiedBy String lastModifiedBy;
}
