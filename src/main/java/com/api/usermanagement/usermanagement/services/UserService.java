package com.api.usermanagement.usermanagement.services;

import com.api.usermanagement.usermanagement.entities.UserEntity;

import java.util.Map;

public interface UserService {

    public Map<Integer, String> findCountries();


    public Map<Integer, String> findStates(Integer countryId);

    public Map<Integer, String> findCities(Integer stateId);

    public boolean isEmailUnique(String emailId);

    public boolean saveUser(UserEntity um);

    //Login page operations
    public String loginCheck(String email, String pwd);

    //Unlock Account Operations
    public boolean isTempPwdValid(String email, String tempPwd);

    public boolean unlockAccount(String email, String newPwd);
    public boolean unlockAccount(String email, String tempPwd, String newPwd);

    //Forgot Password Operations
    public String forgotPassword(String email);
}
