package com.fabricaescuela20241.reserva.Modelo;

import java.sql.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_reserva")
    @GenericGenerator(name = "secuencia_reserva", strategy = "increment")
    @Column(name = "Id_reserva")
    private int idReserva;

    @ManyToOne
    @JoinColumn(name = "Id_vuelo")
    private Vuelo vuelo;

    @Column(name = "fecha_reserva")
    private Date fechaReserva;

    @Column(name = "estado")
    private String estado;

    public Reserva() {
    }

    public Reserva(int idReserva, Vuelo vuelo, Date fechaReserva, String estado) {
        this.idReserva = idReserva;
        this.vuelo = vuelo;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
    }

    public long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

}
