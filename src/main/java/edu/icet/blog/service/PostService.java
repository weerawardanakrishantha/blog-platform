package edu.icet.blog.service;

import edu.icet.blog.dto.PostDTO;
import edu.icet.blog.entiry.PostEntity;
import edu.icet.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public void createPost(PostDTO postDTO){
        PostEntity postEntity=new PostEntity();
        postEntity.setTitle(postDTO.getTitle());
        postEntity.setContent(postDTO.getContent());
        postRepository.save(postEntity);
    }

    public ArrayList<PostDTO> getAll(){
        List<PostEntity> postEntities=postRepository.findAll();
        ArrayList<PostDTO> postDTOS=new ArrayList<>();
        for(PostEntity postEntity:postEntities){
            PostDTO postDTO=new PostDTO();
            postDTO.setId(postEntity.getId());
            postDTO.setTitle(postEntity.getTitle());
            postDTO.setContent(postEntity.getContent());

            postDTOS.add(postDTO);
        }
        return postDTOS;
    }

    public void update(PostDTO postDTO){
        PostEntity postEntity=new PostEntity();
        postEntity.setId(postDTO.getId());
        postEntity.setTitle(postDTO.getTitle());
        postEntity.setContent(postDTO.getContent());

        postRepository.save(postEntity);
    }

    public void delete(int id){
        postRepository.deleteById(id);
    }

    public PostDTO getById(Integer id){
        Optional<PostEntity> postEntity= postRepository.findById(id);
        PostDTO postDTO=new PostDTO();
        if(postEntity!=null){
            postDTO.setId(postEntity.get().getId());
            postDTO.setTitle(postEntity.get().getTitle());
            postDTO.setContent(postEntity.get().getContent());

            return postDTO;
        }else {
            return null;
        }
    }
}
