package com.fabricaescuela20241.reserva.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabricaescuela20241.reserva.Modelo.Usuario;
import com.fabricaescuela20241.reserva.Repositorio.RepositorioUsuario;

@Service
public class ServicioUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario guardarUsuario(Usuario usuario) {
        System.out.println("Se está guardando el usuario");
        return repositorioUsuario.save(usuario);
    }

    public List<Usuario> obtenerTodosLosUsuarios() {
        System.out.println("Se está obteniendo la lista de todos los usuarios");
        return repositorioUsuario.findAll();
    }

    public Usuario obtenerUsuarioPorId(int id) {
        return repositorioUsuario.findById(id).orElse(null);
    }

    public void eliminarUsuarioPorId(int id) {
        repositorioUsuario.deleteById(id);
    }
}

