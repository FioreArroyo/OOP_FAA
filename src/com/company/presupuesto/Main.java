package com.company.presupuesto;

import com.company.presupuesto.ui.FrontEnd;


public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de Registro de Movimientos");
        FrontEnd fe = new FrontEnd ("Sistema Registro de Movimientos");
        fe.build();
    }
}
