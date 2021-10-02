package com.company.presupuesto;

import com.company.presupuesto.entidades.Gasto;
import com.company.presupuesto.entidades.RegistroGastos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de Registro de Gastos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        RegistroGastos registro = new RegistroGastos();

        while (siga){
            System.out.println("Digite el nombre de su gasto:");
            String nombre = consola.nextLine();
            System.out.println("Digite el moneda de su gasto:");
            String moneda = consola.nextLine();
            System.out.println("Digite la categoria de su gasto:");
            String categoria = consola.nextLine();
            System.out.println("Digite el monto de su gasto:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);

            Gasto nuevoGasto = new Gasto(nombre, moneda, categoria, monto);
            registro.addGasto(nuevoGasto);

            for (Gasto g : registro.getGastos()){
            System.out.println(g.getNombre());
            }

            System.out.println("Desea continuar? ('S')");
            siga = consola.nextLine().equals("S");

        }
    }
}
