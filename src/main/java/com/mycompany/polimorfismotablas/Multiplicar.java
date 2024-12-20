package com.mycompany.polimorfismotablas;

public abstract class Multiplicar {
    protected int number;

    public Multiplicar(int number) {
        this.number = number;
    }

    // Mostrar la tabla en orden ascendente
    public abstract void OrdenAscendente();

    // Método abstracto para mostrar la tabla en orden descendente
    public abstract void OrdenDescendente();

    // Método abstracto para sumar los resultados de la tabla
    public abstract int SumaTablas();
    
}
