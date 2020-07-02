package com.data;
import org.springframework.data.repository.CrudRepository;
import com.User;

public interface UserRepository extends CrudRepository<User, Long> {

  User findByUsername(String username);
  
}
