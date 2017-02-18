package br.eti.gregori.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ClassEvent {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@SuppressWarnings("unused")
	private Date classDate;
	
	@ManyToOne
	private User instructor;
	@ManyToOne
	private Dojo dojo;
	@ManyToOne
	private ClassType classType;
	
	private @CreatedDate LocalDateTime createdDate;
    private @LastModifiedDate LocalDateTime lastModifiedDate;

    private @CreatedBy String createdBy;
    private @LastModifiedBy String lastModifiedBy;

}
