package com.clinica.repository_jpa;

import java.util.List;

import com.clinica.factory.UsuarioFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import com.clinica.model.Usuario;

/**
 * Repositório para operações de persistência da entidade Usuario utilizando JPA.
 */
public class UsuarioRepository {
    /**
     * Instância do EntityManager para gerenciar transações e operações.
     */
    static EntityManager entityManager;

    /**
     * Salva um objeto Usuario no banco de dados.
     * 
     * @param usuario O objeto Usuario a ser salvo.
     */
    public static void salvarUsuario(Usuario usuario){
        entityManager = UsuarioFactory.configFactoryUsuario();
        try {
            entityManager.persist(usuario);
            UsuarioFactory.saveAndClose(entityManager);
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();

        }
    }
    /**
     * Busca um Usuario pelo seu ID.
     * 
     * @param id O ID do Usuario a ser buscado.
     * @return O objeto Usuario correspondente ou null se não encontrado.
     */
    public static Usuario getById(final int id) {
        entityManager = UsuarioFactory.configFactoryUsuario();
        return entityManager.find(Usuario.class, id);
    }

    /**
     * Lista todos os objetos Usuario no banco de dados.
     * 
     * @return Uma lista contendo todos os objetos Usuario.
     */
    public static List<Usuario> listAll(){
        entityManager = UsuarioFactory.configFactoryUsuario();

        return entityManager.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
    }

    /**
     * Remove um Usuario do banco de dados pelo ID.
     * 
     * @param id O ID do Usuario a ser removido.
     */
    public static void removerContaPorId(final int id) {
        entityManager = UsuarioFactory.configFactoryUsuario();
        try {
            Usuario usuario = getById(id);
            entityManager.remove(usuario);
            UsuarioFactory.saveAndClose(entityManager);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
