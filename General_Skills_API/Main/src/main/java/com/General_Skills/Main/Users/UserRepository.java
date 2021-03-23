package com.General_Skills.Main.Users;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("Select u FROM User u WHERE u.userName = :userName")
    User findByUserName(@Param("userName")String userName);
}
