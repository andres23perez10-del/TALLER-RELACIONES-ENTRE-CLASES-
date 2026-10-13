/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del animal: ");
        String nombre = sc.nextLine();
        System.out.print("Tipo (1 = Perro, 2 = Gato): ");
        int tipo = Integer.parseInt(sc.nextLine());

        Animal animal = (tipo == 1) ? new Perro(nombre) : new Gato(nombre);
        animal.comer();
        animal.hacerSonido();

        sc.close();
    }
}
