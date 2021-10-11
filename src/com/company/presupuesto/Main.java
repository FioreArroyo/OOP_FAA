package com.company.presupuesto;

import com.company.presupuesto.logicaNegocio.ImplementacionRegistro;
import com.company.presupuesto.logicaNegocio.ImplementacionSuperDummy;
import com.company.presupuesto.logicaNegocio.InterfaceRegistro;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de Registro de Movimientos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        InterfaceRegistro registro;
        System.out.println("Que quiere usar? Fake? (F):");
        if( consola.nextLine().equals("F")){
            registro = new ImplementacionSuperDummy();
        }else {
            registro = new ImplementacionRegistro();
        }

        while (siga){
            System.out.println("Digite el nombre de su movimiento:");
            String nombre = consola.nextLine();
            System.out.println("Digite el moneda de su movimiento:");
            String moneda = consola.nextLine();
            System.out.println("Digite la categoria de su movimiento:");
            String categoria = consola.nextLine();
            System.out.println("Digite el monto de su movimiento:");
            String montoStr = consola.nextLine();

            System.out.println("Indique si es un Gasto (S)");
            if (consola.nextLine().equals("S")){
                registro.addGasto(nombre,
                        moneda,
                        categoria,
                        montoStr);

            } else {
                System.out.println("Especifique la periodicidad:");
                String periodicidad = consola.nextLine();

                registro.addIngreso(nombre,
                        moneda,
                        categoria,
                        montoStr,
                        periodicidad);
            }

            System.out.println("Todos los movimientos:");
            registro.getMovimientos();

            System.out.println("Solo Gastos:");
            registro.getGastos();

            System.out.println("Desea continuar? ('S')");
            siga = consola.nextLine().equals("S");

        }
    }
}
