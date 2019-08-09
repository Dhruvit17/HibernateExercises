/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.demoonetoone.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


/**
 *
 * @author dhruvit
 */
//@Entity
//@Table(name = "address")
@Embeddable
public class Address implements Serializable {


//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private Long id;

    @Column(name = "street_1", length = 40)
    private String street1;

    @Column(name = "street_2", length = 40)
    private String street2;

    @Column(name = "city", length = 20)
    @NotNull
    private String city;

    @Column(name = "state", length = 20)
    @NotNull
    private String state;

    @Column(name = "country", length = 20)
    @NotNull
    private String country;

//    @OneToOne(mappedBy = "address")
//    private Student student;

    public Address() {
    }

    public Address(String street1, String street2, String city, String state, String country) {
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
    
    

}
