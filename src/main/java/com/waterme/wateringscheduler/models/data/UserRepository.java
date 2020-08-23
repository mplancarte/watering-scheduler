package com.waterme.wateringscheduler.models.data;

import com.waterme.wateringscheduler.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}
