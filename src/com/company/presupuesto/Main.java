package com.company.presupuesto;

import com.company.presupuesto.entidades.Gasto;
import com.company.presupuesto.entidades.Ingreso;
import com.company.presupuesto.entidades.Movimiento;
import com.company.presupuesto.entidades.RegistroMovimientos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de Registro de Movimientos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        RegistroMovimientos registro = new RegistroMovimientos();

        while (siga){
            System.out.println("Digite el nombre de su movimiento:");
            String nombre = consola.nextLine();
            System.out.println("Digite el moneda de su movimiento:");
            String moneda = consola.nextLine();
            System.out.println("Digite la categoria de su movimiento:");
            String categoria = consola.nextLine();
            System.out.println("Digite el monto de su movimiento:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);

            Movimiento nuevoMovimiento;

            System.out.println("Indique si es un Gasto (S)");
            if (consola.nextLine().equals("S")){
                nuevoMovimiento = new Gasto(nombre,
                        moneda,
                        categoria,
                        monto);
            } else {
                System.out.println("Especifique la periodicidad:");
                String periodicidad = consola.nextLine();

                nuevoMovimiento = new Ingreso(nombre,
                        moneda,
                        categoria,
                        monto,
                        periodicidad);
            }


            registro.addMovimientos(nuevoMovimiento);

            System.out.println("Todos los movimientos:");
            for (Movimiento movimientos : registro.getMovimientos()){
            System.out.println(movimientos.getNombre());
            }

            System.out.println("Solo Gastos:");
            for (Movimiento g : registro.getGastos()){
                System.out.println(g.getNombre());
            }
            System.out.println("Desea continuar? ('S')");
            siga = consola.nextLine().equals("S");

        }
    }
}
