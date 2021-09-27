package com.company;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class Main {

     static String metodo(String x){
         x =  "El metodo estatico retorna:" + x;
         return  x;
    }

    public static void main(String[] args) {

        //Variables
        String texto = "Cadena de caracteres";
        int entero = 5;
        float flotante = 1.2f;
        Boolean siONo = true;
        Integer entero4 = 4;

        //Condicionales
        if(entero == 5){
            System.out.println("El entero si es 5");
        }else {
            System.out.println("El entero NO es 5");
        }

        switch (entero){
            case 1:
                System.out.println("El entero es 1");
            case 2:
                System.out.println("El entero es 3");
            default:
                System.out.println("El entero no es 1 ni 2");
        }

        //Loops
        int i = 0;
        while (i < 5){
            System.out.println("Numero que corresponde al while:" + i);
            i = i+1;
        }

        for (int j = 0; j < 5; j++){
            System.out.println("Numero que corresponde al for:" + j);
        }

        //Arrays
        String[] objetos ={"Un objeto", "Dos objetos"};
        System.out.println("Que tiene el 0:" + objetos[0]);

        //Method Result
        String resultadoMetodo =  metodo(texto);
        System.out.println(resultadoMetodo);

    }
}
