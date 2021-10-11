package com.company.presupuesto.logicaNegocio;


public interface InterfaceRegistro {

     void getMovimientos();

     void addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad);

     void addGasto(String nombre, String moneda, String categoria, String montoStr);

     void getGastos();



}
