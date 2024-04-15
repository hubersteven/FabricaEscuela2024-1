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
@Table(name = "Condiciones_accesibilidad")
public class CondicionesAccesibilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuenciaCondicion")
    @GenericGenerator(name = "secuenciaCondicion", strategy = "increment")
    @Column(name = "ID_condicion")
    private int idCondicion;

    @ManyToOne
    @JoinColumn(name = "ID_pasajero")
    private Usuario usuario;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "detalles")
    private String detalles;

    public CondicionesAccesibilidad() {
    }

    public CondicionesAccesibilidad(int idCondicion, Usuario usuario, String tipo, String detalles) {
        this.idCondicion = idCondicion;
        this.usuario = usuario;
        this.tipo = tipo;
        this.detalles = detalles;
    }

    public int getIdCondicion() {
        return idCondicion;
    }

    public void setIdCondicion(int idCondicion) {
        this.idCondicion = idCondicion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }  
    
    

}
