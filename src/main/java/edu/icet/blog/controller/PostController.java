package edu.icet.blog.controller;

import edu.icet.blog.dto.PostDTO;
import edu.icet.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("/add")
    public void createPost(@RequestBody PostDTO postDTO){
        postService.createPost(postDTO);
    }

    @GetMapping("/get-all")
    public List<PostDTO> getAll(){
        return postService.getAll();
    }
    @PutMapping("/update")
    public void update(@RequestBody PostDTO postDTO){
        postService.update(postDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        postService.delete(id);
    }
    @GetMapping("/{id}")
    public PostDTO getById(@PathVariable Integer id){
        return postService.getById(id);
    }
}
