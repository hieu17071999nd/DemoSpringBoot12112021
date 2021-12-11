package com.example.demospringboot.repository;

import com.example.demospringboot.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface PostRepo extends JpaRepository<Post, Long> {

    List<Post> findAllByStatus(Long status);
}
