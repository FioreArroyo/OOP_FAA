package com.company.presupuesto;

import com.company.presupuesto.logicaNegocio.ImplementacionGetMovimiento;
import com.company.presupuesto.logicaNegocio.InterfaceRegistro;
import com.company.presupuesto.repo.FileRepository;
import com.company.presupuesto.ui.FrontEnd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de Registro de Movimientos");
        ImplementacionGetMovimiento pool = new ImplementacionGetMovimiento();
       try {
            InterfaceRegistro objeto1 = pool.checkOut();
            objeto1.getMovimientos();

             InterfaceRegistro objeto2 = pool.checkOut();
            objeto2.getMovimientos();

            pool.checkIn(objeto1); //Libera objeto 1 para que sea utilizado
            Thread.sleep(2000);

            InterfaceRegistro objeto3 = pool.checkOut();
            objeto3.getMovimientos();

            pool.checkIn(objeto2); //Libera objeto 2 para que sea utilizado
            pool.checkIn(objeto3); //Libera objeto 3 para que sea utilizado

            Thread.sleep(20000);

            InterfaceRegistro objeto4 = pool.checkOut();
            objeto4.getMovimientos();

            pool.checkIn(objeto4); //Libera objeto 4 para que sea utilizado

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
