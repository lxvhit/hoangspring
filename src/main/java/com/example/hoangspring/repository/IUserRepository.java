package com.example.hoangspring.repository;

import com.example.hoangspring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
}
