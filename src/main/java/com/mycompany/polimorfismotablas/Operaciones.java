package com.mycompany.polimorfismotablas;

public  class Operaciones extends Multiplicar {
    public Operaciones(int number) {
        super(number);
    }
    public void OrdenAscendente() {
        System.out.println("La tabla del " + number + " en orden ascendente:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    
    public void OrdenDescendente() {
        System.out.println("La tabla " + number + " en orden descendente:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    
    public int SumaTablas() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += number * i;
        }
        return suma;
    }

}
