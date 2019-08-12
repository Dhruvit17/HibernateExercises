/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.auction.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dhruvit
 */
@Entity
@Table(name="shipment_user")
public class ShipmentUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ShipmentFor shipmentFor;

    public ShipmentUser() {
    }

    public ShipmentUser(ShipmentFor shipmentFor) {
        this.shipmentFor = shipmentFor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShipmentFor getShipmentFor() {
        return shipmentFor;
    }

    public void setShipmentFor(ShipmentFor shipmentFor) {
        this.shipmentFor = shipmentFor;
    }

    @Override
    public String toString() {
        return "ShipmentUser{" + "id=" + id + ", shipmentFor=" + shipmentFor + '}';
    }
    
    
}
