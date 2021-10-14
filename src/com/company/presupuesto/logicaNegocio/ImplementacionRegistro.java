package com.company.presupuesto.logicaNegocio;
import com.company.presupuesto.entidades.Gasto;
import com.company.presupuesto.entidades.Ingreso;
import com.company.presupuesto.entidades.Movimiento;


import java.util.ArrayList;
import java.util.List;

public class ImplementacionRegistro implements InterfaceRegistro, InterfaceReportes {

   private List<Movimiento> movimientos;

   //Constructor
    public ImplementacionRegistro(){
        this.movimientos = new ArrayList<>();
    }

    //Metodo 1
    public void getMovimientos(){
        for (Movimiento movimientos : movimientos){
            System.out.println(movimientos.getDatails());
        }
    }

    @Override
    public void addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) {
        if (!moneda.equals("USD")){
            System.out.println("Moneda No valida");
        } else {
            int monto = Integer.parseInt(montoStr);
            this.movimientos.add(new Ingreso(nombre,
                    moneda,
                    categoria,
                    monto,
                    periodicidad));
            }
    }

    @Override
    public void addGasto(String nombre, String moneda, String categoria, String montoStr) {
        int monto = Integer.parseInt(montoStr);
        this.movimientos.add(new Gasto(nombre,
                moneda,
                categoria,
                monto));
    }


    //Metodo 3
    public void getGastos(){
        for (Movimiento movimiento : this.movimientos){
        if(movimiento instanceof Gasto){
           System.out.println(movimiento.getDatails());
            }
        }
    }

    @Override
    public void imprimirReporte() {
        for (Movimiento movimiento : this.movimientos){
                System.out.println(movimiento.getDatails());
        }
    }
}
