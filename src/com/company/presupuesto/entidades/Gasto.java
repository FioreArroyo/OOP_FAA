package com.company.presupuesto.entidades;

public class Gasto  extends Movimiento{

    public Gasto(String nombre,
                 String moneda,
                 String categoria,
                 int monto){
        super  (nombre, moneda,categoria,monto);
    }

    @Override
    public String getDatails() {
       return  "GASTO " + this.getNombre() + " - " +
               this.getMoneda() + " - " +
               this.getCategoria() + " - " +
               this.getMonto()
        ;
    }
}
