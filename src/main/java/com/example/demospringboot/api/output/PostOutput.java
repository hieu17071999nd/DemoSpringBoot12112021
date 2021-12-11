package com.example.demospringboot.api.output;

import com.example.demospringboot.entity.Post;

import java.util.ArrayList;
import java.util.List;

public class PostOutput {

    private int page;
    private int totalPage;
    private List<Post> postList = new ArrayList<>();

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
