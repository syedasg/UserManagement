package com.api.usermanagement.usermanagement.entities;


import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table(name="USER_REGISTRATION")
public class UserEntity {

    @Id
    @GeneratedValue
    private Integer Id;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="PASSWORD")
    private String password;
    @Column(name="EMAIL",unique = true)
    private String  email;
    @Column(name="PHONE")
    private String  phoneNo;
    @Column(name="DOB")
    private String   Dob;
    @Column(name="GENDER")
    private String   gender;
    @Column(name="COUNTRY")
    private String   country;
    @Column(name="STATE")
    private String     state;
    @Column(name="CITY")
    private String   city;
    @Column(name="ACCOUNT_STATUS")
    @Value("${UserEntity.accountStatus}")
    private String accountStatus;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}
