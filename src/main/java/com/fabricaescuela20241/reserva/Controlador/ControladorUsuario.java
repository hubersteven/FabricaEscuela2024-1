package com.fabricaescuela20241.reserva.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabricaescuela20241.reserva.Modelo.Usuario;
import com.fabricaescuela20241.reserva.Servicio.ServicioUsuario;

@RestController
@RequestMapping("/usuarios")
public class ControladorUsuario {

    @Autowired
    private final ServicioUsuario servicioUsuario;

    public ControladorUsuario(ServicioUsuario servicioUsuario) {
        this.servicioUsuario = servicioUsuario;
    }

    @GetMapping("/all")
    public List<Usuario> obtenerTodosLosUsuarios() {
        return servicioUsuario.obtenerTodosLosUsuarios();
    }

    @GetMapping("/usuario/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable int id) {
        return servicioUsuario.obtenerUsuarioPorId(id);
    }

    @PostMapping("/agregarUsuario")
    public Usuario crearUsuario(@RequestBody Usuario user) {
        return servicioUsuario.guardarUsuario(user);
    }

    @PutMapping("/actualizar/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario user) {
        return servicioUsuario.guardarUsuario(user);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminarUsuario(@PathVariable int id) {
        servicioUsuario.eliminarUsuarioPorId(id);
    }

}