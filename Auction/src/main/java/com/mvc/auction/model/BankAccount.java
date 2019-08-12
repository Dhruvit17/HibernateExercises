/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.auction.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dhruvit
 */
@Entity
@Table(name = "bankaccount")
public class BankAccount extends BillingDetails{


    @Column(name = "number")
    private String number;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "swift")
    private String swift;

    public BankAccount() {
    }
    
    public BankAccount(String number, String bankName, String swift, String street) {
        super(street);
        this.number = number;
        this.bankName = bankName;
        this.swift = swift;
    }

    public Long getId() {
        return super.getId();
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "id=" + super.getId() + ", number=" + number + ", bankName=" + bankName + ", swift=" + swift + '}';
    }
    
    
}
