package com.company.presupuesto.logicaNegocio;

import java.util.Hashtable;
import java.util.Enumeration;


public abstract class  ObjectPool<T> {
    private long tiempoExpiracion;
    private Hashtable<T, Long> bloqueados; //Objetos creados cuando no existen objetos instanciados libres para utilizarse
    private Hashtable<T, Long> nobloqueados; //Objetos instanciados que están libres para utilizarse

    public ObjectPool(){
       tiempoExpiracion = 30000;
       bloqueados = new Hashtable<T, Long>();
       nobloqueados = new Hashtable<T, Long>();
    }

    protected abstract T crear();
    public abstract boolean validar(long tiempoExpiracion, long tiempoTranscurrido, long ahora);
    public abstract void expirar(T o);

    public synchronized  T checkOut() {
        T t;
        long ahora = System.currentTimeMillis();
        if( nobloqueados.size() > 0 ){ // Si existen objetos instanciados libres de utilizarse
            Enumeration e = nobloqueados.keys();
             while (e.hasMoreElements()) {
                    t = (T) e.nextElement();
                 long tiempoTrasnscurrido = nobloqueados.get(t);

                 if(validar(tiempoExpiracion, tiempoTrasnscurrido, ahora)){
                     // Si la instancia del objeto no ha vencido
                     nobloqueados.remove(t);
                     bloqueados.put(t,ahora);
                     return(t);
                 }
                 else{
                     // Si ya venció
                     nobloqueados.remove(t);
                     expirar(t);
                     t = null;
                 }
                }
            }
        // no hay objetos disponibles, por lo que creamos uno nuevo
        t = crear();
        bloqueados.put(t, ahora);
        return(t);
    }

    public synchronized void checkIn(T t){
        bloqueados.remove(t);
        nobloqueados.put(t,System.currentTimeMillis());
    }


}
