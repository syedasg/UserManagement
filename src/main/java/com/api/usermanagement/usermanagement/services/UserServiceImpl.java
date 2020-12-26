package com.api.usermanagement.usermanagement.services;

import com.api.usermanagement.usermanagement.entities.UserEntity;
import com.api.usermanagement.usermanagement.repositories.*;
import com.api.usermanagement.usermanagement.utilities.EmailService;
import com.api.usermanagement.usermanagement.utilities.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl {

}
   /*

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

    public boolean getForm(){
        UserEntity enity=new UserEntity();


        return false;
    }

    public List<String> getGenders() {
		/*List<GenderDtlsEntity> findAll = gendersRepo.findAll();

		List<String> genders = new ArrayList<>();
		findAll.forEach(entity -> {
			genders.add(entity.getGenderTxt());
		});

		return genders;*/
/*
        return gendersRepo.getGenders();
    }

    public List<String> getStates() {
        return stateRepo.getStateNames();
    }

    public List<String> getCountries() {
        return countryRepo.getCountryNames();
    }
    public List<String> getCities() {
        return cityRepo.getCityNames();
    }



    public String signup(UserEntity user){

        user.setPassword(PasswordGenerator.generateRandomPassword());
        userRepo.save(user);
        emailServ.sendSimpleMessage(user.getEmail(),"test mail","Test");
        return "saved sucessfully";
    }


   /* public void signIn(UserEntity entity) {
        userRepo.find
    }*/

