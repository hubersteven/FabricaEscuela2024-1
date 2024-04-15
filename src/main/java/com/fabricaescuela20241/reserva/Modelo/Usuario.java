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
@Table(name = "Pasajero")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuenciaUsuario")
    @GenericGenerator(name = "secuenciaUsuario", strategy = "increment")
    @Column(name = "ID_pasajero")
    private int idPasajero;

    @ManyToOne
    @JoinColumn(name = "ID_reserva")
    private Reserva reserva;

    @Column(name = "nombre")
    private String nombres;

    @Column(name = "apellido")
    private String apellidos;

    @Column(name = "num_pasaporte")
    private String numeroPasaporte;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo")
    private String correo;

    public Usuario() {
    }

    public Usuario(int idPasajero, Reserva reserva, String nombres, String apellidos, String numeroPasaporte,
            String telefono, String correo) {
        this.idPasajero = idPasajero;
        this.reserva = reserva;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroPasaporte = numeroPasaporte;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
  
}

