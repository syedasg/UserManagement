package com.api.usermanagement.usermanagement.repositories;

import com.api.usermanagement.usermanagement.entities.CityNames;
import com.api.usermanagement.usermanagement.entities.CountryNames;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface CityRepo extends CrudRepository<CityNames, Serializable> {


    @Query("select cityName from CityNames")
    public List<String> getCityNames();

    public List<CityNames> findAllByStateId(Integer stateId);
}
