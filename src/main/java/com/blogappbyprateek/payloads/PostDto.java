package com.blogappbyprateek.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	private Integer postId;
	private String title;
	private String imageName;
	private String content;
	private Date addedDate;
	private UserDto user;
	private CategoryDto category;
	private Set<CommentDto> comments = new HashSet<>();

}
