package com.core.app.blogs_api.common;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	 @Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	
    @Setter
    @CreatedDate
    @Column(name = "created_at")
	private Date createdAt;
    
    @Setter
    @LastModifiedDate
    @Column(name = "updated_at")
	private Date updatedAt;
	

}
