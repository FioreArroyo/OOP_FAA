package com.company.presupuesto.entidades;

import java.util.Date;

public class Gasto {
    private String nombre;
    private String moneda;
    private String categoria;
    private int monto;
    private Date fecha;

    public Gasto(String nombre, String moneda, String categoria, int monto){
        this.nombre = nombre;
        this.moneda = moneda;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = new Date();
    }

    public String getNombre(){
        return  this.nombre;
    }

}
