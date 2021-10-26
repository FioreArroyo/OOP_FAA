package com.company.presupuesto.logicaNegocio;


public class FormatoInvalido extends NumberFormatException {

    private String montoStr;

    public FormatoInvalido(String montoStr, String error) {
        super(error);
        this.montoStr = montoStr;
    }

    public String getMessage(){

        return "Formato Invalido en ("+this.montoStr+"): " + super.getMessage();
    }
}