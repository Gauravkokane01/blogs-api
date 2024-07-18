package com.core.app.blogs_api.articles;

import com.core.app.blogs_api.common.BaseModel;
import com.core.app.blogs_api.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "articles")
@Builder
public class ArticleModel extends BaseModel {

	@NonNull
	@Size(min = 10, max = 150, message = "Title must be between 10 and 150 characters")
	@Column(name = "title", nullable = false, length = 150)
	private String title;

	@NonNull
	@Column(name = "slug", nullable = false, length = 100, unique = true)
	private String slug;

	@NonNull
	@Column(name = "body", nullable = false, length = 3000)
	private String body;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private ArticleStatus status;

	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

}
