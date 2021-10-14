package com.company.presupuesto.entidades;

import java.util.Date;

public class Ingreso extends Movimiento {

    private  String periodicidad;

    public Ingreso(String nombre,
                   String moneda,
                   String categoria,
                   int monto,
                   String periodicidad){
        super(nombre, moneda,categoria, monto);
        this.periodicidad = periodicidad;
    }
    @Override
    public String getNombre(){
        return  super.getNombre() + " " + this.periodicidad;
    }

    @Override
    public String getDatails() {
        return  "INGRESO " + this.getNombre() + " - " +
                this.getMoneda() + " - " +
                this.getCategoria() + " - " +
                this.getMonto() + " - " +
                this.periodicidad
                ;
    }


}
