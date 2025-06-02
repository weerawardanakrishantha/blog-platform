package edu.icet.blog.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostDTO {
    private Long id;
    private String title;
    private String content;
    private String tags;
    private String category;
    private Integer comments_count;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private String image_url;
}
