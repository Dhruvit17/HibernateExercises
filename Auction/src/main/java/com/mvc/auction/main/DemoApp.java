/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.auction.main;

import com.mvc.auction.Config.HibernateConfig;
import com.mvc.auction.model.Address;
import com.mvc.auction.model.AddressType;
import com.mvc.auction.model.Bid;
import com.mvc.auction.model.BidStatus;
import com.mvc.auction.model.BillingDetails;
import com.mvc.auction.model.Category;
import com.mvc.auction.model.Comment;
import com.mvc.auction.model.CreditCard;
import com.mvc.auction.model.Item;
import com.mvc.auction.model.Shipment;
import com.mvc.auction.model.ShipmentFor;
import com.mvc.auction.model.ShipmentUser;
import com.mvc.auction.model.User;
import com.mvc.auction.model.UserAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

/**
 *
 * @author dhruvit
 */
public class DemoApp {
    public static Logger logger = Logger.getLogger(DemoApp.class.getName());
    private static EntityManager entityManager = HibernateConfig.getEntityManager();
    
    public static void main(String[] args) {
        entityManager.getTransaction().begin();
//        entityManager.persist();

List<Address> address = new ArrayList<>();
        Address a = new Address("street", "360001", "local");
        address.add(a);
        
//        BankAccount bankAccount = new BankAccount("102020103040", "SBR", "fdsgv");
        
        Set<Bid> bids = new HashSet<>();
        bids.add(new Bid(500, new Date(2018, 1, 1),BidStatus.APPROVED));
        Category category = new Category("cat", new Date(2017, 1, 1));
        
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment("wqe","asd"));
        
        List<UserAddress> userAddress = new ArrayList<>();
        UserAddress ua = new UserAddress(AddressType.HOME);
        userAddress.add(ua);
        
        Set<UserAddress> setua = new HashSet<>();
        setua.add(ua);
        a.setUserAddress(setua);
        
        List<ShipmentUser> shipmentUsers = new ArrayList<>();
        shipmentUsers.add(new ShipmentUser(ShipmentFor.SELLER));
        
        CreditCard creditCard = new CreditCard("type", "Number", "monthend", "yearEnd", "street");
        
        Item item = new Item("firstname", "description", 0, 0, new Date(), new Date(), "state", new Date(), comments, bids);
        
        List<Item> items = new ArrayList<>();
        items.add(item);
        
        Set<BillingDetails> billingDetails = new HashSet<>();
        billingDetails.add(creditCard);
        
        
        Shipment shipment = new Shipment(0, "state", new Date(), a , item,shipmentUsers);
//        ShipmentUser shipmentUser = new ShipmentUser(ShipmentFor.SELLER);
        User user = new User("firstname", "middleName", "lastname", "username", "password", "email@dot.com", 0, false, comments, bids, userAddress, shipmentUsers);
        user.setBillingDetails(billingDetails);
        user.setBoughtBy(items);
        user.setBillingDetails(billingDetails);
        List<User> users = new ArrayList<>();
        users.add(user);
        
        item.setSoldTo(users);
        
        entityManager.persist(user);
        entityManager.persist(item);
        entityManager.persist(shipment);
        
        
        entityManager.getTransaction().commit();
    }
}
