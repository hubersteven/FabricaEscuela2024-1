package com.fabricaescuela20241.reserva.Modelo;

import java.sql.Timestamp;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vuelo")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_vuelo")
    @GenericGenerator(name = "secuencia_vuelo", strategy = "increment")
    
    @Column(name="ID_vuelo")
    private int idVuelo;

    @Column(name="tipo_vuelo")
    public String tipoVuelo;

    @Column(name="origen")
    public String origen;

    @Column(name="destino")
    public String destino;

    @Column(name="fecha_salida")
    public Timestamp fechasalida;

    @Column(name="fecha_llegada")
    public Timestamp fechaLLegada; 

    @Column(name="hora_salida")
    public Timestamp horasalida;

    @Column(name="hora_llegada")
    public Timestamp horaLLegada;
    
    @Column(name="cantidad_pasajeros")
    public int CanMaxPasajeros;
    
    
    public Vuelo() {
    }


    public Vuelo(int idVuelo, String tipoVuelo, String origen, String destino, Timestamp fechasalida,
            Timestamp fechaLLegada, Timestamp horasalida, Timestamp horaLLegada, int canMaxPasajeros) {
        this.idVuelo = idVuelo;
        this.tipoVuelo = tipoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechasalida = fechasalida;
        this.fechaLLegada = fechaLLegada;
        this.horasalida = horasalida;
        this.horaLLegada = horaLLegada;
        CanMaxPasajeros = canMaxPasajeros;
    }


    public int getIdVuelo() {
        return idVuelo;
    }


    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }


    public String getTipoVuelo() {
        return tipoVuelo;
    }


    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }


    public String getOrigen() {
        return origen;
    }


    public void setOrigen(String origen) {
        this.origen = origen;
    }


    public String getDestino() {
        return destino;
    }


    public void setDestino(String destino) {
        this.destino = destino;
    }


    public Timestamp getFechasalida() {
        return fechasalida;
    }


    public void setFechasalida(Timestamp fechasalida) {
        this.fechasalida = fechasalida;
    }


    public Timestamp getFechaLLegada() {
        return fechaLLegada;
    }


    public void setFechaLLegada(Timestamp fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }


    public Timestamp getHorasalida() {
        return horasalida;
    }


    public void setHorasalida(Timestamp horasalida) {
        this.horasalida = horasalida;
    }


    public Timestamp getHoraLLegada() {
        return horaLLegada;
    }


    public void setHoraLLegada(Timestamp horaLLegada) {
        this.horaLLegada = horaLLegada;
    }


    public int getCanMaxPasajeros() {
        return CanMaxPasajeros;
    }


    public void setCanMaxPasajeros(int canMaxPasajeros) {
        CanMaxPasajeros = canMaxPasajeros;
    }

}
