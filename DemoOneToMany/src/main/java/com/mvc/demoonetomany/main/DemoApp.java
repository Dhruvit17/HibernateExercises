/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.demoonetomany.main;

import com.mvc.demoonetomany.config.HibernateConfig;
import com.mvc.demoonetomany.model.Attachment;
import com.mvc.demoonetomany.model.Personnel;
import com.mvc.demoonetomany.model.Proposal;
import com.mvc.demoonetomany.model.Qualification;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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

        byte[] b = "hello world".getBytes();

        List<Personnel> p1 = new ArrayList<>();
        p1.add(new Personnel("Dhruvit", Qualification.BEGINNER, "1234567890"));

        List<Attachment> a1 = new ArrayList<>();
        a1.add(new Attachment("new attachment", "17", LocalDateTime.MAX, b));

        Proposal proposal = new Proposal("My praposal", "new comment", p1, a1);
        
//        For Addss        
//        addProposal(proposal);

        List<Proposal> list = getProposals();
        for (Proposal item : list) {
            System.out.println(item.getAttachments());
            System.out.println(item.getComment());
            System.out.println(item.getId());
            System.out.println(item.getPersonnels());
            System.out.println(item.getTitle());
        }

//        For Delete        
//        removePraposal(2L);

//        For Update
//        Proposal p = getProposalById(1L);
//        p.setComment("Comment updated");
//        updatePraposal(1L, p);

    }

    public static void addProposal(Proposal proposal) {

        entityManager.getTransaction().begin();
        entityManager.persist(proposal);
        entityManager.getTransaction().commit();

    }

    public static List<Proposal> getProposals() {
        List<Proposal> list = new ArrayList<>();
        list = entityManager.createQuery("from Proposal").getResultList();

        return list;
    }

    public static Proposal getProposalById(Long id) {
        Proposal proposal = null;
        proposal = entityManager.find(Proposal.class, id);

        return proposal;
    }

    public static void removePraposal(Long id) {

        entityManager.getTransaction().begin();
        Proposal old = entityManager.find(Proposal.class, id);
        entityManager.remove(old);
        entityManager.getTransaction().commit();

    }

    public static void updatePraposal(Long id, Proposal proposal) {

        entityManager.getTransaction().begin();
        Proposal old = entityManager.find(Proposal.class, id);
        old.setComment(proposal.getComment());
        entityManager.getTransaction().commit();

    }
}
