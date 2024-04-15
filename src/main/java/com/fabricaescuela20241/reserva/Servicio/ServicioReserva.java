package com.fabricaescuela20241.reserva.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabricaescuela20241.reserva.Modelo.Reserva;
import com.fabricaescuela20241.reserva.Repositorio.RepositorioReserva;

@Service
public class ServicioReserva {

    @Autowired
    private RepositorioReserva repositorioReserva;

    public Reserva guardarReserva(Reserva reserva) {
        return repositorioReserva.save(reserva);
    }

    public List<Reserva> obtenerTodasLasReservas() {
        System.out.println("Se está obteniendo la lista de todas las reservas");
        return repositorioReserva.findAll();
    }

    public Reserva obtenerReservaPorId(int id) {
        return repositorioReserva.findById(id).orElse(null);
    }

    public void eliminarReservaPorId(int id) {
        System.out.println("Se está eliminando la reserva");
        repositorioReserva.deleteById(id);
    }

}
