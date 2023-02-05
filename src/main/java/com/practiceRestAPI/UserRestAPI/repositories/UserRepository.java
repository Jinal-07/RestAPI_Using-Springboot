package com.practiceRestAPI.UserRestAPI.repositories;

import com.practiceRestAPI.UserRestAPI.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
