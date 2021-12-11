package com.example.demospringboot.dto;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

public class PostDTO {

    private String title;
    private String content;

    public List<PostDTO> postDTOList = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
