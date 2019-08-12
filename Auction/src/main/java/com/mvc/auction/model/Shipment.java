/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.auction.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author dhruvit
 */
@Entity
@Table(name = "shipment")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "inspection_period_days")
    private int inspectionPeriodDays;

    @Column(name = "state")
    private String state;

    @Column(name = "created")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_item")
    private Item item;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="shipment_id")
    private List<ShipmentUser> shipmentUsers;

    public Shipment() {
    }

    public Shipment(int inspectionPeriodDays, String state, Date created, Address address, Item item, List<ShipmentUser> shipmentUsers) {
        this.inspectionPeriodDays = inspectionPeriodDays;
        this.state = state;
        this.created = created;
        this.address = address;
        this.item = item;
        this.shipmentUsers = shipmentUsers;
    }

    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getInspectionPeriodDays() {
        return inspectionPeriodDays;
    }

    public void setInspectionPeriodDays(int inspectionPeriodDays) {
        this.inspectionPeriodDays = inspectionPeriodDays;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<ShipmentUser> getShipmentUsers() {
        return shipmentUsers;
    }

    public void setShipmentUsers(List<ShipmentUser> shipmentUsers) {
        this.shipmentUsers = shipmentUsers;
    }

    @Override
    public String toString() {
        return "Shipment{" + "id=" + id + ", inspectionPeriodDays=" + inspectionPeriodDays + ", state=" + state + ", created=" + created + ", address=" + address + ", item=" + item + ", shipmentUsers=" + shipmentUsers + '}';
    }
    
    
}
