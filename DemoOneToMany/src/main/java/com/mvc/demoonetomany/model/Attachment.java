/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.demoonetomany.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author dhruvit
 */
@Entity
@Table(name = "attachment")
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "filename", length = 20)
    @NotNull
    private String filename;

    @Column(name = "filesize", length = 10)
    @NotNull
    private String filesize;

    @Column(name = "created")
    @CreationTimestamp
    private LocalDateTime created;

    @Column(name = "attachment")
    @NotNull
    private byte[] attachment;

    public Attachment() {
    }

    public Attachment(String filename, String filesize, LocalDateTime created) {
        this.filename = filename;
        this.filesize = filesize;
        this.created = created;
    }

    public Attachment(String filename, String filesize, LocalDateTime created, byte[] attachment) {
        this.filename = filename;
        this.filesize = filesize;
        this.created = created;
        this.attachment = attachment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public byte[] getAttachment() {
        return attachment;
    }

    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }

}
