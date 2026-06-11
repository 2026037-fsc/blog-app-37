package com.example.blog_app;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository){
        this.blogRepository = blogRepository;
    }

    public List<Blog> findAll(){
        return blogRepository.findAll();
    }

    public void add(BlogForm form){
        String title = form.getTitle();
        if (title.isEmpty()) {
            throw new IllegalArgumentException("記事が入力されていません");
        }

        blogRepository.save(new Blog(null, form.getTitle(), form.getContent(), null));
    }

    public Optional<Blog> findById(Long id){
        return blogRepository.findById(id);
    }
}
