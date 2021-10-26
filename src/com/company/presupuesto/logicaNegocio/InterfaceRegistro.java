package com.company.presupuesto.logicaNegocio;


import com.company.presupuesto.repo.ErrorMuyPocaData;

public interface InterfaceRegistro {

     boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) throws ErrorMuyPocaData;
     boolean addGasto(String nombre, String moneda, String categoria, String montoStr) throws ErrorMuyPocaData;

     void getMovimientos();

     void getGastos();
}
