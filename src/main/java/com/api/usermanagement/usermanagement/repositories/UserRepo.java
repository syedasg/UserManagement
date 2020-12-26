package com.api.usermanagement.usermanagement.repositories;

import com.api.usermanagement.usermanagement.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface UserRepo extends CrudRepository<UserEntity, Serializable> {
    @Query("select genderTxt from GenderDetails")
    public List<String> findByfirstName();



   UserEntity findByEmailandPassword(String email, String newPwd);

    UserEntity findByEmail(String email);
}
