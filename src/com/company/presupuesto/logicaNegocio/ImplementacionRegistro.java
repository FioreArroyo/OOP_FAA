package com.company.presupuesto.logicaNegocio;

import com.company.presupuesto.entidades.Gasto;
import com.company.presupuesto.entidades.Ingreso;
import com.company.presupuesto.repo.InterfaceReposotory;


public class ImplementacionRegistro implements InterfaceRegistro {

    private InterfaceReposotory repository;

    public ImplementacionRegistro(InterfaceReposotory reposotory){
        this.repository = reposotory;

    }

    @Override
    public boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) {

        int monto;
        try {
            monto = Integer.parseInt(montoStr);
        }catch (NumberFormatException ex){
            System.out.println("Formato inválido en ("+montoStr+"): "+ ex.getMessage());
            return  false;
        }

        Ingreso ingreso = new Ingreso(nombre,
                moneda,
                categoria,
                monto,
                periodicidad);
        return this.repository.save(ingreso.getDatails());

    }

    @Override
    public boolean addGasto(String nombre, String moneda, String categoria, String montoStr) {
        int monto = Integer.parseInt(montoStr);
        Gasto gasto = new Gasto(nombre,
                moneda,
                categoria,
                monto);
        return this.repository.save(gasto.getDatails());
    }

    @Override
    public void getMovimientos() {
        this.repository.read();
    }

    @Override
    public void getGastos() {
        this.repository.read();
    }
}
