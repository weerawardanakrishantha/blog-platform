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
        postEntity.setTags(postDTO.getTags());
        postEntity.setCategory(postDTO.getCategory());
        postEntity.setComments_count(postDTO.getComments_count());
        postEntity.setCreated_at(postDTO.getCreated_at());
        postEntity.setUpdated_at(postDTO.getUpdated_at());
        postEntity.setImage_url(postDTO.getImage_url());

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
            postDTO.setTags(postEntity.getTags());
            postDTO.setCategory(postEntity.getCategory());
            postDTO.setComments_count(postEntity.getComments_count());
            postDTO.setCreated_at(postEntity.getCreated_at());
            postDTO.setUpdated_at(postEntity.getUpdated_at());
            postDTO.setImage_url(postEntity.getImage_url());

            postDTOS.add(postDTO);
        }
        return postDTOS;
    }

    public void update(PostDTO postDTO){
        PostEntity postEntity=new PostEntity();
        postEntity.setId(postDTO.getId());
        postEntity.setTitle(postDTO.getTitle());
        postEntity.setContent(postDTO.getContent());
        postEntity.setTags(postDTO.getTags());
        postEntity.setCategory(postDTO.getCategory());
        postEntity.setComments_count(postDTO.getComments_count());
        postEntity.setCreated_at(postDTO.getCreated_at());
        postEntity.setUpdated_at(postDTO.getUpdated_at());
        postEntity.setImage_url(postDTO.getImage_url());

        postRepository.save(postEntity);
    }

    public void delete(Long id){
        postRepository.deleteById(id);
    }

    public PostDTO getById(Long id){
        Optional<PostEntity> postEntity= postRepository.findById(id);
        PostDTO postDTO=new PostDTO();
        if(postEntity!=null){
            postDTO.setId(postEntity.get().getId());
            postDTO.setTitle(postEntity.get().getTitle());
            postDTO.setContent(postEntity.get().getContent());
            postDTO.setTags(postEntity.get().getTags());
            postDTO.setCategory(postEntity.get().getCategory());
            postDTO.setComments_count(postEntity.get().getComments_count());
            postDTO.setCreated_at(postEntity.get().getCreated_at());
            postDTO.setUpdated_at(postEntity.get().getUpdated_at());
            postDTO.setImage_url(postEntity.get().getImage_url());

            return postDTO;
        }else {
            return null;
        }
    }
}
