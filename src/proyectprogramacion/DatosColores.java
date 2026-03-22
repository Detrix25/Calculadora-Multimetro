package proyectprogramacion;

import java.util.Scanner;

public class DatosColores {

    private int ultimaBanda; 
    Scanner lee = new Scanner(System.in);

    public DatosColores() {
        ultimaBanda = 0;
    }

    public DatosColores(int banda) {
        ultimaBanda = banda;
    }

    public int getUltimaBanda() {
        return ultimaBanda;
    }
    
    public void setUltimaBanda(int b) {
        ultimaBanda = b;
    }
    
    public int leerBanda(int numeroBanda) {
        System.out.println("Escribe el numero de la Banda " + numeroBanda + ":");
        System.out.println("0 = Negro");
        System.out.println("1 = Cafe");
        System.out.println("2 = Rojo");
        System.out.println("3 = Naranja");
        System.out.println("4 = Amarillo");
        System.out.println("5 = Verde");
        System.out.println("6 = Azul");
        System.out.println("7 = Violeta");
        System.out.println("8 = Gris");
        System.out.println("9 = Blanco");
        ultimaBanda = lee.nextInt();
        return ultimaBanda;
    }

    public int leerTolerancia() {
        System.out.println("Escribe la tolerancia:");
        System.out.println("1=Cafe | 2=Rojo | 5=Verde | 6=Azul | 7=Violeta | 10=Dorado | 11=Plateado");
        return lee.nextInt();
    }

    public double leerOhms() {
        System.out.println("Escribe el valor en Ohms:");
        return lee.nextDouble();
    }
    
    public void mostrarUltimaBanda() {
        System.out.println("Ultima banda ingresada: " + ultimaBanda);
    }
}
