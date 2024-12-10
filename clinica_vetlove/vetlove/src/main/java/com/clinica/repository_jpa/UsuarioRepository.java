package com.clinica.repository_jpa;

import com.clinica.factory.UsuarioFactory;
import com.clinica.model.Usuario;

public class UsuarioRepository {
    public static void salvarUsuario(Usuario usuario){
        try{
            entityManager.persist(usuario);
            UsuarioFactory.saveAndClose(entityManager);
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            //Verificar de onde ele é o método entityManager 
        }
    }
    public static Usuario getById(final int id) {
        //Parta agora para a criação da classe Factory;
    }
}
