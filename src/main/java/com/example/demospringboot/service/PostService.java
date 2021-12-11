package com.example.demospringboot.service;

import com.example.demospringboot.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {
    List<Post> getAllByStatus(Long status);

    Post insert(Post post);

    Post getById(Long id);

    void deletePost(Long id);

    Post findOne(Long id);

    Post save(Post post);
}
