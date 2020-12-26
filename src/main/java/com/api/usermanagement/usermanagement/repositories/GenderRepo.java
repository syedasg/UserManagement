package com.api.usermanagement.usermanagement.repositories;

import com.api.usermanagement.usermanagement.entities.GenderDetails;
import com.api.usermanagement.usermanagement.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface GenderRepo extends CrudRepository<GenderDetails, Serializable> {

    @Query("select genderTxt from GenderDetails")
    public List<String> getGenders();
}
