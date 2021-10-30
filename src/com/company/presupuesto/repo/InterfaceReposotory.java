package com.company.presupuesto.repo;

import com.company.presupuesto.repo.ErrorMuyPocaData;
import java.util.List;

public interface InterfaceReposotory {

    boolean save (String text) throws ErrorMuyPocaData;
    List<String> read ();
}
