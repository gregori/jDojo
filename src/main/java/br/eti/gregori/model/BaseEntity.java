package br.eti.gregori.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

/**
 * Created by encef on 16/12/2016.
 */
@Data
class BaseEntity {
    private @CreatedDate LocalDateTime createdDate;
    private @LastModifiedDate LocalDateTime lastModifiedDate;

    private @ManyToOne @CreatedBy String createdBy;
    private @ManyToOne @LastModifiedBy String lastModifiedBy;
}
