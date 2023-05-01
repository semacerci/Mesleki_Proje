package com.example.toplandapp.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "community")
@Data
public class Community {
    @Id
    Long id;


    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    @JsonIgnore
    Category category;

    @ManyToOne(fetch = FetchType.LAZY)//Post objesini çekince userı getirmene gerek yok diyoruz.
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)//bir user silinince communitylerde silinsin
    @JsonIgnore
    User user;


    String name;

    @Column(columnDefinition = "text")
    String description;

    String location;

}
