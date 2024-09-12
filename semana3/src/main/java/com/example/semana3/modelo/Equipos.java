package com.example.semana3.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;
import java.util.Date;

@Entity
public class Equipos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int idEquipo;
    @Column
    @Getter
    @Setter
    private String nombreEquipo;
    @Column
    @Getter
    @Setter
    private String descripcionEquipo;
    @Column
    @Getter
    @Setter
    private Date fecha_adquisicio;
    @Column
    @Getter
    @Setter
    private Integer costo;
    @Column
    @Getter
    @Setter
    private String estado;
    @Column
    @Getter
    @Setter
    private Date fecha_ultimo_mantenimiento;
    @Column
    @Getter
    @Setter
    private String proveedor;
    @Column
    @Getter
    @Setter
    private String garantia;
    @Column
    @Getter
    @Setter
    private String serial;
    @Column
    @Getter
    @Setter
    private String modelo;
    @Column
    @Getter
    @Setter
    private String tipo;
    @Column
    @Getter
    @Setter
    private String responsable;
    @Column
    @Getter
    @Setter
    private Date fecha_creacion;
}
