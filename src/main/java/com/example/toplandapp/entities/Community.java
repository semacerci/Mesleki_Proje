package com.example.toplandapp.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "community")
@Data
public class Community {
    @Id
    Long id;
    Long userId;
    String title;
    @Lob//Large obje demek-büyük veri tipleri için
    @Column(columnDefinition = "text")
    String desc;


}
