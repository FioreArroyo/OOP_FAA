package com.company.presupuesto;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String luz = "Luz";
        String colones = "Colones";
        String internet = "Internet";
        int mtoLuz = 18000;
        int mtoInternet = 35000;

        System.out.println("Lista de Gastos");

        Gasto gastoLuz = new Gasto();
        gastoLuz.nombre = luz;
        gastoLuz.moneda = colones;
        gastoLuz.monto =  mtoLuz;

        Gasto gastoInternet = new Gasto();
        gastoInternet.nombre = internet;
        gastoInternet.moneda = colones;
        gastoInternet.monto =  mtoInternet;

        RegistroGastos registro = new RegistroGastos();
        registro.gastos = new ArrayList<>();
        registro.gastos.add(gastoLuz);
        registro.gastos.add(gastoInternet);

        for (int i = 0; i < registro.gastos.size(); i++){
            System.out.println(registro.gastos.get(i).nombre +" = " + registro.gastos.get(i).monto);
        }

    }
}
