package edu.icet.blog.entiry;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
