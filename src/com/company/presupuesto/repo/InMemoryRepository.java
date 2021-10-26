package com.company.presupuesto.repo;

import com.company.presupuesto.entidades.Movimiento;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements  InterfaceReposotory {

    //private List<Movimiento> movimientos;
    List<String> movimientos;

    public InMemoryRepository(){
        movimientos = new ArrayList<>();
    }


    @Override
    public boolean save(String text) {
        movimientos.add(text);
        return  true;
    }

    @Override
    public void read() {
        for(String item : this.movimientos){
            System.out.println(item);
        }
    }
}
