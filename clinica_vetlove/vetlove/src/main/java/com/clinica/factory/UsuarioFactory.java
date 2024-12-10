package com.clinica.factory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UsuarioFactory {
    public static EntityManagerFactory emf;

    public static EntityManager configFactoryUsuario(){
        emf = Persistence.createEntityManagerFactory("VetLove"); //criar uma class Persistence
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        return em;
    }

    //public static void
}
