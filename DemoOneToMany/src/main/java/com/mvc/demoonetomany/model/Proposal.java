/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.demoonetomany.model;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 *
 * @author dhruvit
 */
@Entity
@Table(name = "proposal")
public class Proposal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "title", length = 20)
    @NotNull
    private String title;

    @Column(name = "comment", length = 100)
    @NotNull
    private String comment;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="proposal_id")
    private List<Personnel> personnels;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="personnel_id")
    private List<Attachment> attachments;

    public Proposal() {
    }

    public Proposal(String title, String comment, List<Personnel> personnels, List<Attachment> attachments) {
        this.title = title;
        this.comment = comment;
        this.personnels = personnels;
        this.attachments = attachments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Personnel> getPersonnels() {
        return personnels;
    }

    public void setPersonnels(List<Personnel> personnels) {
        this.personnels = personnels;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
    
    
}
