package com.shiv.java.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shiv.java.model.Phoneactivity;
import com.shiv.java.utils.HibernateUtil;

public class PhoneactivityService {

    /**
     * Save Phoneactivity
     */
    public void savePhoneactivity(Phoneactivity phoneactivity) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) { 
            transaction = session.beginTransaction();
            session.save(phoneactivity);
            transaction.commit();
        } catch (Exception e) {                                 //Service page for all the operation
            if (transaction != null) {
            }
            e.printStackTrace();
        }
    }

    /**
     * Update Phoneactivity
     */
    public void updatePhoneactivity(Phoneactivity phoneactivity) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(phoneactivity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
               // transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Delete Phoneactivity
     */
    public void deletePhoneactivity(int id) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Phoneactivity phoneactivity = session.get(Phoneactivity.class, id);
            if (phoneactivity != null) {
                session.delete(phoneactivity);
                System.out.println("phoneactivity is deleted");
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
            }
            e.printStackTrace();
        }
    }

    /**
     * Get Phoneactivity By ID
     */
    public Phoneactivity getPhoneactivity(int id) {  

        Transaction transaction = null;
        Phoneactivity phoneactivity = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            phoneactivity = session.get(Phoneactivity.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                //transaction.rollback();
            }
            e.printStackTrace();
        }
        return phoneactivity;
    }

    /**
     * Get all Phoneactivity
     */
    @SuppressWarnings("unchecked")
    public List < Phoneactivity > getAllPhoneactivity() { 

        Transaction transaction = null;
        List < Phoneactivity > listOfUser = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            listOfUser = session.createQuery("from Phoneactivity").getResultList(); 
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfUser;
    }
}