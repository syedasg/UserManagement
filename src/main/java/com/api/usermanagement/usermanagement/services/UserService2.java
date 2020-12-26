package com.api.usermanagement.usermanagement.services;

import com.api.usermanagement.usermanagement.entities.CityNames;
import com.api.usermanagement.usermanagement.entities.CountryNames;
import com.api.usermanagement.usermanagement.entities.StateNames;
import com.api.usermanagement.usermanagement.entities.UserEntity;
import com.api.usermanagement.usermanagement.repositories.*;
import com.api.usermanagement.usermanagement.utilities.EmailService;
import com.api.usermanagement.usermanagement.utilities.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//import static org.graalvm.compiler.phases.common.DeadCodeEliminationPhase.Optionality.Optional;

public class UserService2 implements UserService{

    @Autowired
    private EmailService emailServ;

    @Autowired
    private GenderRepo gendersRepo;

    @Autowired
    private StateRepo stateRepo;

    @Autowired
    private CountryRepo countryRepo;

    @Autowired
    private CityRepo cityRepo;

    @Autowired
    private UserRepo userRepo;





    @Override
    public Map<Integer, String> findCountries() {
      List<CountryNames> countryList = (List<CountryNames>) countryRepo.findAll();

       return countryList!=null  ?  countryList.stream()
                                            .collect(Collectors.toMap(CountryNames::getCountryId,CountryNames::getCountryName))
                                 :  null;


    }

    @Override
    public Map<Integer, String> findStates(Integer countryId) {
         List<StateNames> stateList=stateRepo.findAllBycountryId(countryId);

                 //return stateList.isPresent() ?

                        return stateList!=null ? stateList.stream()
                                                          .collect(Collectors.toMap(StateNames::getStateId,StateNames::getStateName))

                                                :null;



    }

    @Override
    public Map<Integer, String> findCities(Integer stateId) {
        //return (Map<Integer, String>) cityRepo.findAllBystateId(stateId);
        List<CityNames> cityList=cityRepo.findAllByStateId(stateId);

        //return stateList.isPresent() ?

        return cityList!=null ? cityList.stream()
                .collect(Collectors.toMap(CityNames::getCityId,CityNames::getCityName))

                :null;

    }

    @Override
    public boolean isEmailUnique(String emailId) {
        UserEntity user=userRepo.findByEmail(emailId);

     return user!=null?true:false;

    }

    @Override
    public boolean saveUser(UserEntity user) {
        user.setPassword(PasswordGenerator.generateRandomPassword());

      return userRepo.save(user).getId() != null ;
    }

    @Override
    public String loginCheck(String email, String pwd) {
        UserEntity user=userRepo.findByEmailandPassword(email,pwd);
        if(user !=null)
            if( user.getAccountStatus().equals("LOCKED"))
            return "AccountLocked";
            else
                return "LOGIN SUCEESFULL";
        else
        return "INVALID CREDENTIALS";
    }

    @Override
    public boolean isTempPwdValid(String email, String tempPwd) {
        UserEntity user=userRepo.findByEmailandPassword(email,tempPwd);
        return false;
    }

    @Override
    public boolean unlockAccount(String email, String newPwd) {
        return false;
    }

    @Override
    public boolean unlockAccount(String email, String tempPwd, String newPwd) {
        UserEntity user=userRepo.findByEmailandPassword(email,tempPwd);
        if(user!=null)
        {
            user.setPassword(newPwd);
            userRepo.save(user);
            return true;

        }
        else
            return false;

    }

    @Override
    public String forgotPassword(String email) {
        UserEntity user=userRepo.findByEmail(email);
        if (user!=null)
            return "Check your email for Password Reset link";
        else
            return "Email Not Exists";
    }
}
