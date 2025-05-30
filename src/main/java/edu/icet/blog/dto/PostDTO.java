package edu.icet.blog.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostDTO {
    private int id;
    private String title;
    private String content;
}
