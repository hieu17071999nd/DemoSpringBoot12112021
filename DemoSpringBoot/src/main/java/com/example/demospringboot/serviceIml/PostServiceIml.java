package com.example.demospringboot.serviceIml;

import com.example.demospringboot.entity.Post;
import com.example.demospringboot.repository.PostRepo;
import com.example.demospringboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceIml implements PostService {

    @Autowired
    private PostRepo postRepo;

    public List<Post> getPostList() {
        return postRepo.findAll();
    }

    public List<Post> getAllByStatus(Long status) {
        status = 1L;
        postRepo.findAll();
        return postRepo.findAllByStatus(status);
    }

    public Post insert(Post post) {
        return postRepo.save(post);
    }

    public Post getById(Long id) {
        return postRepo.getById(id);
    }

    public void deletePost(Long id) {
        postRepo.deleteById(id);
    }

    public Post findOne(Long id) {
        return postRepo.getById(id);
    }

    public Post save(Post post) {
        return postRepo.save(post);
    }

}
