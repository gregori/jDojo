package br.eti.gregori.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by encef on 16/12/2016.
 */
@Data
@Entity
//@EntityListeners(AuditingEntityListener.class)
public class Permission {
    private @Id @GeneratedValue Long id;
    private String route;
    @OneToMany(mappedBy = "permission")
    private Set<UserPermission> userPermission;

    private @CreatedDate LocalDateTime createdDate;
    private @LastModifiedDate LocalDateTime lastModifiedDate;

    private @CreatedBy String createdBy;
    private @LastModifiedBy String lastModifiedBy;

    public Permission() {
    }
}
