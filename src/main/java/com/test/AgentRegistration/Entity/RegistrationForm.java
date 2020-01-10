package com.test.AgentRegistration.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "RegistrationForm")
public class RegistrationForm implements Serializable {
  @Id
  @Column(name = "id", unique = true)
  @GeneratedValue
    private Long id;
    @Column(name = "fname")
    @NotEmpty
    private String fname;
    @Column(name = "lname")
    @NotEmpty
    private String lname;
    @Column(name = "email")
    @NotEmpty
    private  String email;
    @Column(name = "confirmEmail")
    @NotEmpty
    private String confirmEmail;

    @Column(name = "phoneno")
    @NotEmpty
    private String phoneno;
    @NotEmpty
    @Column(name = "confirmphoneno")
    private  String confirmphoneno;
    /*@NotEmpty
    @Column(name = "address")
    private  String address;
    @NotEmpty
    @Column(name = "password")
    private String password;*/

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public String getConfirmphoneno() {
        return confirmphoneno;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public void setConfirmphoneno(String confirmphoneno) {
        this.confirmphoneno = confirmphoneno;
    }

   /*public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/
}
