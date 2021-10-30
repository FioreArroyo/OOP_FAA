package com.company.presupuesto.logicaNegocio;

import java.util.List;

public class ImplementacionSuperDummy implements InterfaceRegistro, InterfaceReportes {
    @Override
    public List<String> getMovimientos() {
        System.out.println("No haga nada");
        return null;
    }

    @Override
    public boolean addIngreso(String nombre, String moneda, String categoria, String monto, String periodicidad) {
        System.out.println("No haga nada");
        return true;
    }

    @Override
    public boolean addGasto(String nombre, String moneda, String categoria, String monto) {
        System.out.println("No haga nada");
        return  true;
    }


    @Override
    public void getGastos() {

        System.out.println("No haga nada");
    }


}
