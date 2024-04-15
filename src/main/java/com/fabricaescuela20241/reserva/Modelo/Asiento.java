package com.fabricaescuela20241.reserva.Modelo;

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
@Table(name = "Asiento")
public class Asiento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuenciaAsiento")
    @GenericGenerator(name = "secuenciaAsiento", strategy = "increment")
    @Column(name = "ID_asiento")
    private int idAsiento;

    @ManyToOne
    @JoinColumn(name = "ID_reserva")
    private Reserva reserva;

    @Column(name = "numero")
    private String numero;

    @Column(name = "clase")
    private String clase;

    public Asiento() {
    }

    public Asiento(int idAsiento, Reserva reserva, String numero, String clase) {
        this.idAsiento = idAsiento;
        this.reserva = reserva;
        this.numero = numero;
        this.clase = clase;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    
}
