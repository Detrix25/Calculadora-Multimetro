package proyectprogramacion;

import java.util.Scanner;

public class Datos {

    private double R; 
    public double I;
    public double P;
    public double V;
    public double R1;
    public double R2;
    public double R3;
    public double R4;
    public double R5;
    public double R6;
    Scanner lee = new Scanner(System.in);

    public double getR() { return R; }
    public void setR(double r) { R = r; }

    public void mostrarDatos() {
        System.out.println("R: " + R + " | I: " + I + " | P: " + P + " | V: " + V);
    }

    public double leerdatoR() {
        System.out.println("Escribe Resistencia");
        R = lee.nextDouble();
        return R;
    }

    public double leerdatoI() {
        System.out.println("Escribe Intensidad");
        I = lee.nextDouble();
        return I;
    }

    public double leerdatoP() {
        System.out.println("Escribe Potencia");
        P = lee.nextDouble();
        return P;
    }

    public double leerdatoV() {
        System.out.println("Escribe Voltaje");
        V = lee.nextDouble();
        return V;
    }

    public double leerdatoR1() {
        System.out.println("Escribe Resistencia 1");
        R1 = lee.nextDouble();
        return R1;
    }

    public double leerdatoR2() {
        System.out.println("Escribe Resistencia 2");
        R2 = lee.nextDouble();
        return R2;
    }

    public double leerdatoR3() {
        System.out.println("Escribe Resistencia 3");
        R3 = lee.nextDouble();
        return R3;
    }

    public double leerdatoR4() {
        System.out.println("Escribe Resistencia 4");
        R4 = lee.nextDouble();
        return R4;
    }

    public double leerdatoR5() {
        System.out.println("Escribe Resistencia 5");
        R5 = lee.nextDouble();
        return R5;
    }

    public double leerdatoR6() {
        System.out.println("Escribe Resistencia 6");
        R6 = lee.nextDouble();
        return R6;
    }
}
