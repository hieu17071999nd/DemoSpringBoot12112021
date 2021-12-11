package com.example.demospringboot.api;

import com.example.demospringboot.entity.Post;
import com.example.demospringboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostAPI {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/post2/get")
    private List<Post> getAll() {
        return postService.getAllByStatus(1L);
    }

    @PostMapping(value = "/post2")
    private Post insert(@RequestBody Post post) {
        return postService.insert(post);
    }

    @GetMapping(value = "/post2/{id}")
    private Post getById(@PathVariable Long id) {
        return postService.getById(id);
    }

    @DeleteMapping(value = "post2/{id}")
    private void delete(@PathVariable("id") Long id) {
        postService.deletePost(id);
    }

    @PutMapping(value = "/post2/update")
    private void update(@RequestBody Post post) {
        Post postOld  = new Post();
        if (post.getId() != null) {
            postOld = postService.findOne(post.getId());
            postOld.setTitle(post.getTitle());
            postOld.setContent(post.getTitle());
            postOld.setStatus(post.getStatus());
//            postOld.setUpdateDate();
            postService.save(postOld);
        }

    }


}
