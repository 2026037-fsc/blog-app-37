package com.example.blog_app;

import java.time.LocalDateTime;

public class Blog {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime day_time;

    public Blog(Long id, String title, String content, LocalDateTime day_time){
        this.id = id;
        this.title = title;
        this.content = content;
        this.day_time = day_time;
    }

    public Blog(){
        
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDay_time(LocalDateTime day_time) {
        this.day_time = day_time;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDay_time() {
        return day_time;
    }
    
}
