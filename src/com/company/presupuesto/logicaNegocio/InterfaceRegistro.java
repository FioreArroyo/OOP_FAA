package com.company.presupuesto.logicaNegocio;


public interface InterfaceRegistro {

     boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad);

     boolean addGasto(String nombre, String moneda, String categoria, String montoStr);

     void getMovimientos();

     void getGastos();
}
