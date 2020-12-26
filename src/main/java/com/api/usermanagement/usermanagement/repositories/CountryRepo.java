package com.api.usermanagement.usermanagement.repositories;

import com.api.usermanagement.usermanagement.entities.CountryNames;
import com.api.usermanagement.usermanagement.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface CountryRepo extends CrudRepository<CountryNames, Serializable> {


    @Query("select * from CountryNames")
    public Map<Integer, String> getCountryNames();
}
