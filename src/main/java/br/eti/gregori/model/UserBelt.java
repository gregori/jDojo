package br.eti.gregori.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by encef on 18/12/2016.
 */
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class UserBelt {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;
    @ManyToOne
    private Belt belt;
    
    @NotNull
    private boolean current = false;

    @OneToOne
    private UserBelt lastUserBelt;

    @SuppressWarnings("unused")
    private Date examDate;

    @Lob
    private String annotations;
    @Lob
    private String remarks;

    @CreatedDate
    private LocalDateTime createdDate;
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String lastModifiedBy;
}
