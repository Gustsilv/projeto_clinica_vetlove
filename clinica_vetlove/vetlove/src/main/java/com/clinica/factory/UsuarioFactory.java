package com.clinica.factory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Classe de fábrica para configuração e gerenciamento de EntityManager e EntityManagerFactory.
 * Essa classe facilita a criação, configuração e encerramento de transações e conexões com o banco de dados.
 */

public class UsuarioFactory {
    /**
     * EntityManagerFactory para gerenciar a conexão com o banco de dados.
     * Deve ser instanciado apenas uma vez por aplicação.
     */
    public static EntityManagerFactory emf;
    /**
     * Método responsável por configurar e retornar uma instância de EntityManager.
     * O EntityManager é utilizado para gerenciar as transações e operações de persistência.
     *
     * @return uma instância configurada de EntityManager.
     */
    public static EntityManager configFactoryUsuario(){
        emf = Persistence.createEntityManagerFactory("Clinica-VetLove"); //criar um arquivo Persistence(Feito)
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        return em;

    }
    /**
     * Método responsável por salvar alterações no banco de dados e fechar as conexões.
     *
     * @param em Instância de EntityManager cuja transação será finalizada.
     */
    public static void saveAndClose(EntityManager em){
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
