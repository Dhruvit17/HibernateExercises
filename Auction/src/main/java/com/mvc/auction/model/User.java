/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.auction.model;

import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

/**
 *
 * @author dhruvit
 */
@Entity
@Table(name = "user",schema = "public")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName", length = 20)
    private String firstName;

    @Column(name = "middleName", length = 20)
    private String middleName;

    @Column(name = "lastName", length = 20)
    private String lastName;

    @Column(name = "userName", length = 20)
    private String userName;

    @Column(name = "password", length = 20)
    private String password;

    @Column(name = "email", length = 30)
    @Email
    @Pattern(regexp = "/^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$/")
    private String email;

    @Column(name = "ranking")
    private int ranking;

    @Column(name = "admin")
    private boolean admin;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Comment> comments;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Set<Bid> bids;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<UserAddress> userAddress;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<ShipmentUser> shipmentUser;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Set<BillingDetails> billingDetails;
    
    @OneToMany(cascade = CascadeType.ALL)    
    private List<Item> boughtBy;

    public User() {
    }

    public User(String firstName, String middleName, String lastName, String userName, String password, String email, int ranking, boolean admin, List<Comment> comments, Set<Bid> bids, List<ShipmentUser> shipmentUser, Set<BillingDetails> billingDetails) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.ranking = ranking;
        this.admin = admin;
        this.comments = comments;
        this.bids = bids;
        this.shipmentUser = shipmentUser;
        this.billingDetails = billingDetails;
    }

    public User(String firstName, String middleName, String lastName, String userName, String password, String email, int ranking, boolean admin, List<Comment> comments, Set<Bid> bids, List<UserAddress> userAddress, List<ShipmentUser> shipmentUser) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.ranking = ranking;
        this.admin = admin;
        this.comments = comments;
        this.bids = bids;
        this.userAddress = userAddress;
        this.shipmentUser = shipmentUser;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Set<Bid> getBids() {
        return bids;
    }

    public void setBids(Set<Bid> bids) {
        this.bids = bids;
    }

    public List<UserAddress> getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(List<UserAddress> userAddress) {
        this.userAddress = userAddress;
    }

    public List<ShipmentUser> getShipmentUser() {
        return shipmentUser;
    }

    public void setShipmentUser(List<ShipmentUser> shipmentUser) {
        this.shipmentUser = shipmentUser;
    }

    public Set<BillingDetails> getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(Set<BillingDetails> billingDetails) {
        this.billingDetails = billingDetails;
    }

    public List<Item> getBoughtBy() {
        return boughtBy;
    }

    public void setBoughtBy(List<Item> boughtBy) {
        this.boughtBy = boughtBy;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", userName=" + userName + ", password=" + password + ", email=" + email + ", ranking=" + ranking + ", admin=" + admin + ", comments=" + comments + ", bids=" + bids + ", userAddress=" + userAddress + ", shipmentUser=" + shipmentUser + ", billingDetails=" + billingDetails + ", boughtBy=" + boughtBy + '}';
    }
    
    
}
