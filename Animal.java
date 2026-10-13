/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionentreclases;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Animal {
    protected String nombre;

    public Animal(String nombre) { this.nombre = nombre; }

    public void comer() { System.out.println(nombre + " está comiendo"); }
    public void hacerSonido() { System.out.println("Sonido genérico"); }
}

class Perro extends Animal {
    public Perro(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() { System.out.println(nombre + " dice: Guau"); }
}

class Gato extends Animal {
    public Gato(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() { System.out.println(nombre + " dice: Miau"); }
}
