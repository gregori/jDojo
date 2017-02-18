package br.eti.gregori.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by encef on 17/12/2016.
 */
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Belt {
    @Id @GeneratedValue
    private Long id;
    @SuppressWarnings("unused")
    private String color;
    @SuppressWarnings("unused")
    private String colorCode;
    @SuppressWarnings("unused")
    private Long beltTime;
    @SuppressWarnings("unused")
    private boolean child;
    @OneToOne
    private Belt nextBelt;

    @OneToMany(mappedBy = "belt")
    private Set<BeltRequisite> beltRequisites;

    @OneToMany(mappedBy = "belt")
    private Set<UserBelt> userBelts;

    @CreatedDate
    private LocalDateTime createdDate;
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String lastModifiedBy;
}
