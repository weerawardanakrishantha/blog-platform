package edu.icet.blog.entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="post")
public class PostEntity {
    @Id
    private int id;
    private String title;
    private String content;
}
