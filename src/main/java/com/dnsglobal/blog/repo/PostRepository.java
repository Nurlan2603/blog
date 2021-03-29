package com.dnsglobal.blog.repo;

import com.dnsglobal.blog.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
