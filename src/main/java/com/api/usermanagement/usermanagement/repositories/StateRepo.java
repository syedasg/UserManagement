package com.api.usermanagement.usermanagement.repositories;

import com.api.usermanagement.usermanagement.entities.StateNames;
import com.api.usermanagement.usermanagement.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface StateRepo extends CrudRepository<StateNames, Serializable> {

    @Query("select stateName from StateNames")
    public List<String> getStateNames();

    List<StateNames> findAllBycountryId(Integer countryId);
}
