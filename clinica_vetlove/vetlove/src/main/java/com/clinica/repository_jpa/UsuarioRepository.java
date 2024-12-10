package com.clinica.repository_jpa;

import java.util.List;

import com.clinica.factory.UsuarioFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import com.clinica.model.Usuario;


public class UsuarioRepository {
    static EntityManager entityManager;

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
    
    public static Usuario getById(final int id) {
        entityManager = UsuarioFactory.configFactoryUsuario();
        return entityManager.find(Usuario.class, id);
    }

    
    public static List<Usuario> listAll(){
        entityManager = UsuarioFactory.configFactoryUsuario();

        return entityManager.createQuery("SELECT * FROM Usuario", Usuario.class).getResultList();
    }

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
