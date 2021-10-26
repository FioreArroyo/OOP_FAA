package com.company.presupuesto.repo;

public interface InterfaceReposotory {

    boolean save (String text) throws ErrorMuyPocaData;
    void  read();
}
