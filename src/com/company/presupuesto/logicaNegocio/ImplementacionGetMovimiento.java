package com.company.presupuesto.logicaNegocio;

public class ImplementacionGetMovimiento  extends ObjectPool<InterfaceRegistro>  {

        public  ImplementacionGetMovimiento() {
            super();
        }

        @Override
        protected InterfaceRegistro crear() {
            return null;
            //return  new ImplementacionRegistro();
        }

        @Override
        public boolean validar(long tiempoExpiracion, long tiempoTranscurrido, long ahora) {
            //Si ya venció
            if(( ahora - tiempoTranscurrido) > tiempoExpiracion){
                return  false;

            }else {
                return true;
            }
        }

        @Override
        public void expirar(InterfaceRegistro o) {
            o = null; // liberación de memoria
        }

    }
