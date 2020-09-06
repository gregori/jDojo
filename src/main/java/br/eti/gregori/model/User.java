package br.eti.gregori.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

/**
 * Created by encef on 16/12/2016.
 */
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
    @SuppressWarnings("unused")
	private int register;
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private Date dob;
    @SuppressWarnings("unused")
    private Long cpf;
    @SuppressWarnings("unused")
    private Long rg;
    @SuppressWarnings("unused")
    private String email;
    @SuppressWarnings("unused")
    private String street;
    @SuppressWarnings("unused")
    private int number;
    @SuppressWarnings("unused")
    private String complement;
    @SuppressWarnings("unused")
    private String neighborhood;
    @SuppressWarnings("unused")
    private String city;
    @SuppressWarnings("unused")
    private String state;
    @SuppressWarnings("unused")
    private Boolean child;
    @SuppressWarnings("unused")
    private Boolean active = true;
    @SuppressWarnings("unused")
    private Long cep;
    @SuppressWarnings("unused")
    private String fatherName;
    @SuppressWarnings("unused")
    private String motherName;
    @SuppressWarnings("unused")
    private Long responsibleCpf;
    @SuppressWarnings("unused")
    private Long responsibleRg;
    @SuppressWarnings("unused")
    private String bloodType;
    @SuppressWarnings("unused")
    private String phone;
    @SuppressWarnings("unused")
    private String mobilePhone;
    @SuppressWarnings("unused")
    private String emergencyPhone;
    @SuppressWarnings("unused")
    private Date subscriptionDate;
    @SuppressWarnings("unused")
    private Date anajDate;
    @SuppressWarnings("unused")
    private String healthIssues;
   
    @OneToMany(mappedBy = "user")
    private Set<UserPermission> userPermissions;
    @OneToMany(mappedBy = "user")
    private Set<Presence> presences;
    @OneToMany(mappedBy = "user")
    private Set<UserBelt> userBelts;
    @OneToMany(mappedBy = "instructor")
    private Set<ClassEvent> classes;

    @ManyToOne
    private Dojo dojo;

    private @CreatedDate LocalDateTime createdDate;
    private @LastModifiedDate LocalDateTime lastModifiedDate;

    private @CreatedBy String createdBy;
    private @LastModifiedBy String lastModifiedBy;

//    @PrePersist
//    private void prePersist() {
//    	if (active == null) {
//    		active = true;
//    	}
//    }
}
