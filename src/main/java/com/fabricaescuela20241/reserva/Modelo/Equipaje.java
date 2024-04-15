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
@Table(name = "Equipaje")
public class Equipaje {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuenciaEquipaje")
    @GenericGenerator(name = "secuenciaEquipaje", strategy = "increment")
    @Column(name = "ID_equipaje")
    private int idEquipaje;

    @ManyToOne
    @JoinColumn(name = "ID_reserva")
    private Reserva reserva;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "peso")
    private  float peso;

    public Equipaje() {
    }

    public Equipaje(int idEquipaje, Reserva reserva, int cantidad, float peso) {
        this.idEquipaje = idEquipaje;
        this.reserva = reserva;
        this.cantidad = cantidad;
        this.peso = peso;
    }

    public int getIdEquipaje() {
        return idEquipaje;
    }

    public void setIdEquipaje(int idEquipaje) {
        this.idEquipaje = idEquipaje;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    
}
