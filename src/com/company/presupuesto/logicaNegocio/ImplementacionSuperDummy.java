package com.company.presupuesto.logicaNegocio;



public class ImplementacionSuperDummy implements InterfaceRegistro, InterfaceReportes {
    @Override
    public void getMovimientos() {
        System.out.println("No haga nada");
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

    @Override
    public void imprimirReporte() {
        System.out.println("No haga nada");

    }
}
