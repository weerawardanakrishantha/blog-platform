package edu.icet.blog.entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="user")
public class UserEntity {
    @Id
    private Long id;
    private String name;
    private String password;
}
