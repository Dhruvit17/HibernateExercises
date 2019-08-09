/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.demoonetoone.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 *
 * @author dhruvit
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", length = 15)
    private String firstName;

    @Column(name = "middle_name", length = 15)
    private String middleName;

    @Column(name = "last_name", length = 15)
    private String lastName;

    @Column(name = "prefix", length = 5)
    private String prefix;

    @Column(name = "suffix", length = 10)
    @Email
    private String suffix;

    @Column(name = "email", length = 15)
    private String email;

    @Column(name = "contact", length = 10)
    private Long contact;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @Embedded
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "education_id", referencedColumnName = "id")
    private Education education;

    public Student() {
    }

    public Student(String firstName, String middleName, String lastName, String prefix, String suffix, String email, Long contact, Address address, Education education) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.prefix = prefix;
        this.suffix = suffix;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.education = education;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    
}