package com.company.presupuesto.logicaNegocio;

import com.company.presupuesto.entidades.Movimiento;
import com.company.presupuesto.repo.InterfaceReposotory;

import java.util.List;
import java.util.stream.Collectors;

public class ImplementacionReportes implements InterfaceReportes{
    private InterfaceReposotory repository;

    public ImplementacionReportes(InterfaceReposotory repository){

        this.repository = repository;
    }

    @Override
    public List<String> getMovimientos() {
        Movimiento m = new Movimiento("nombre",
                "USD",
                "Cat",
                2) {
            @Override
            public String getDatails() {
                return "";
            }
        };

        return this.repository.read().stream().map(item -> item + "\n")
                .collect(Collectors.toList());
    }

    @Override
    public void getGastos() {
        this.repository.read();
    }
}