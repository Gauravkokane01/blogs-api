package com.core.app.blogs_api.common;

import java.util.Date;

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
	private String id;

	@Setter
	@CreatedDate
	@Column(name = "created_at")
	private Date createdAt;

	@Setter
	@LastModifiedDate
	@Column(name = "updated_at")
	private Date updatedAt;

	public BaseModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseModel(String id, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		
		this.updatedAt = updatedAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "BaseModel [id=" + id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
