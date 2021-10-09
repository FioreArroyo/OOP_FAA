package com.company.presupuesto.entidades;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RegistroMovimientos {

   private List<Movimiento> movimientos;

   //Constructor
    public RegistroMovimientos(){
        this.movimientos = new ArrayList<>();
    }

    //Metodo 1
    public List<Movimiento> getMovimientos(){
        return this.movimientos;
    }

    public List<Gasto> getGastos(){
        List<Gasto> respuesta = this.movimientos
                .stream()
                .filter(movimiento -> movimiento instanceof Gasto)
                .map(movimiento -> (Gasto) movimiento)
                .collect(Collectors.toList());
        return respuesta;
    }

    //Metodo 2
    public void addMovimientos(Movimiento item){
        this.movimientos.add(item);
    }
}
