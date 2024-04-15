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

import com.fabricaescuela20241.reserva.Modelo.Reserva;
import com.fabricaescuela20241.reserva.Servicio.ServicioReserva;

@RestController
@RequestMapping("/reservas")
public class ControladorReserva {
    
    @Autowired
    private final ServicioReserva servicioReserva;

    
    public ControladorReserva(ServicioReserva servicioReserva) {
        this.servicioReserva = servicioReserva;
    }

    @GetMapping("/all")
    public List<Reserva> obtenerTodasLasReservas() {
        return servicioReserva.obtenerTodasLasReservas();
    }

    @GetMapping("/{id}")
    public Reserva obtenerReservaPorId(@PathVariable int id) {
        return servicioReserva.obtenerReservaPorId(id);
    }

    @PostMapping("/crearReserva")
    public Reserva crearReserva(@RequestBody Reserva reserva) {
        return servicioReserva.guardarReserva(reserva);
    }

    @PutMapping("/actualizarReserva/{id}")
    public Reserva actualizarReserva(@PathVariable int id, @RequestBody Reserva reserva) {
        return servicioReserva.guardarReserva(reserva);
    }

    @DeleteMapping("/eliminarReserva/{id}")
    public void eliminarReserva(@PathVariable int id) {
        servicioReserva.eliminarReservaPorId(id);
    }

}
