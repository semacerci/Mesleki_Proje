package com.example.toplandapp.repos;

import com.example.toplandapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


//repository'ler bizim hazır sql methodlarının tutlduğu yer gibi düşünebilirz.
//jparepository içinde bu hazır methodlar var
public interface UserRepository extends JpaRepository<User,Long> {
}
