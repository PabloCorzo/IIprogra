package com.prograII;

public class Fecha {
    private int dia_, mes_, anio_;

    public Fecha(int d, int m, int a){
        dia_=d;
        mes_=m;
        anio_ = a;
    }

    public int dia(){
        return dia_;
    }

    public int mes(){
        return mes_;
    }

    public int anio(){
        return anio_;
    }

    public Fecha maniana(){
       return new Fecha(dia_ + 1,mes_,anio_);
    }
}
