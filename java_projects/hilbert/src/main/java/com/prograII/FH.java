package com.prograII;
import acm.graphics.GTurtle;
public class FH extends GTurtle{
    void H(int n){
        if(n>0){
            left(90);
            HI(n-1);
            right(90);
            forward(5);
            H(n-1);
            left(90);
            forward(5);
            right(90);
            H(n-1);
            right(180);
            forward(5);
            left(90);
            HI(n-1);
            left(90);
        }
    }
    void HI(int n){
        if (n>0){
            right(90);
            H(n-1);
            left(90);
            forward(5);
            HI(n-1);
            right(90);
            forward(5);
            left(90);
            HI(n-1);
            left(180);
            forward(5);
            right(90);
            H(n-1);
            right(90);
        }
     }
     public void run() {
        // Establecer el tamaño (en píxeles) de la tortuga.
        setSize(10);
        // Bajar la pluma de la tortuga para que deje un
        // rastro al momento de desplazarse.
        penDown();
        H(10);
    }
    public FH(){
        this.start();
    }
}