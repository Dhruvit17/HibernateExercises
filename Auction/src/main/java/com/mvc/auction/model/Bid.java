/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.auction.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author dhruvit
 */
@Entity
@Table(name = "bid")
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private long amount;

    @Column(name = "created")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;
    
    @Enumerated(EnumType.STRING)
    private BidStatus bidStatus;

    public Bid() {
    }

    public Bid(long amount, Date created, BidStatus bidStatus) {
        this.amount = amount;
        this.created = created;
        this.bidStatus = bidStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BidStatus getBidStatus() {
        return bidStatus;
    }

    public void setBidStatus(BidStatus bidStatus) {
        this.bidStatus = bidStatus;
    }

    @Override
    public String toString() {
        return "Bid{" + "id=" + id + ", amount=" + amount + ", created=" + created + ", bidStatus=" + bidStatus + '}';
    }
    
    
    
}
