package com.example.toplandapp.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//bunun db tabloya mapleneceği
@Table(name = "user")//bu tablonun adı
@Data//bu clası getter ve setterlarını otomatik oluşturdu lombok eklentisi sayesinde
public class User {

    @Id
    Long id;

    String userName;
    String ePosta;
    String password;




}
