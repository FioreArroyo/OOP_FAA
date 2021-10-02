package com.company.presupuesto.entidades;
import java.util.ArrayList;
import java.util.List;

public class RegistroGastos {
   private List<Gasto> gastos;

    public RegistroGastos(){
        this.gastos = new ArrayList<>();
    }
    public List<Gasto> getGastos(){
       return this.gastos;
    }

    public void addGasto(Gasto item){
        this.gastos.add(item);
    }
}
