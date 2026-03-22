package proyectprogramacion;

import java.util.Scanner;

/**
 *
 * @author Espej
 */
public class Menu {
    
    Scanner sc = new Scanner(System.in);
    Voltaje bas = new Voltaje();
    Intesidad bes = new Intesidad();
    Resistencia bis = new Resistencia();
    Potencia bos = new Potencia();
    ResistenciaSerie bus = new ResistenciaSerie();
    ResistenciaParalelo baas = new ResistenciaParalelo();
    Datos sd = new Datos();
    CodigoColores colores = new CodigoColores();
    DatosColores dc = new DatosColores();

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("=== MENU Multimetro ===");
            System.out.println("1. Voltaje Por Resistencia Intensidad");
            System.out.println("2. Voltaje Por Potencia Intensidad");
            System.out.println("3. Voltaje Por Resistecnia Potencia");
            System.out.println("4. Intensidad Por Potencia Resistencia");
            System.out.println("5. Intensidad Por Potencia Voltaje");
            System.out.println("6. Intensidad Por Voltaje Resistencia");
            System.out.println("7. Resistencia Por Voltaje Intensidad");
            System.out.println("8. Resistencia Por Voltaje Potencia");
            System.out.println("9. Resistencia Por Potencia Intensidad");
            System.out.println("10. Potencia Por Voltaje Resistencia");
            System.out.println("11. Potencia Por Resistencia Intensidad");
            System.out.println("12. Potencia Por Voltaje Intensidad");
            System.out.println("13. Resistencia Serie");
            System.out.println("14. Resistencia Paralelo");
            System.out.println("15. Colores a Ohms");
            System.out.println("16. Ohms a Colores");
            System.out.println("17. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    double R = sd.leerdatoR();
                    double I = sd.leerdatoI();
                    System.out.println("El Voltaje es: " + bas.VoltajeMetodoRI(R, I));
                }
                case 2 -> {
                    double P = sd.leerdatoP();
                    double I = sd.leerdatoI();
                    System.out.println("El Voltaje es: " + bas.VoltajeMetodoPI(P, I));
                }
                case 3 -> {
                    double P = sd.leerdatoP();
                    double R = sd.leerdatoR();
                    System.out.println("El Voltaje es: " + bas.VoltajeMetodoRP(R, P));
                }
                case 4 -> {
                    double P = sd.leerdatoP();
                    double R = sd.leerdatoR();
                    System.out.println("La Intensidad es: " + bes.IntensidadMetodoPR(P, R));
                }
                case 5 -> {
                    double P = sd.leerdatoP();
                    double V = sd.leerdatoV();
                    System.out.println("La Intensidad es: " + bes.IntensidadMetodoPV(P, V));
                }
                case 6 -> {
                    double V = sd.leerdatoV();
                    double R = sd.leerdatoR();
                    System.out.println("La Intensidad es: " + bes.IntensidadMetodoVR(R, V));
                }
                case 7 -> {
                    double V = sd.leerdatoV();
                    double I = sd.leerdatoI();
                    System.out.println("La Resistencia es: " + bis.VoltajeYCorriente(V, I));
                }
                case 8 -> {
                    double P = sd.leerdatoP();
                    double V = sd.leerdatoV();
                    System.out.println("La Resistencia es: " + bis.VoltajeYPotencia(P, V));
                }
                case 9 -> {
                    double P = sd.leerdatoP();
                    double I = sd.leerdatoI();
                    System.out.println("La Resistencia es: " + bis.PotenciaYCorriente(P, I));
                }
                case 10 -> {
                    double V = sd.leerdatoV();
                    double R = sd.leerdatoR();
                    System.out.println("La Potencia es: " + bos.PotenciaMetodoVR(V, R));
                }
                case 11 -> {
                    double R = sd.leerdatoR();
                    double I = sd.leerdatoI();
                    System.out.println("La Potencia es: " + bos.PotenciaMetodoRI(R, I));
                }
                case 12 -> {
                    double V = sd.leerdatoV();
                    double I = sd.leerdatoI();
                    System.out.println("La Potencia es: " + bos.PotenciaMetodoVI(V, I));
                }
                case 13 -> {
                    double R1 = sd.leerdatoR1();
                    double R2 = sd.leerdatoR2();
                    double R3 = sd.leerdatoR3();
                    double R4 = sd.leerdatoR4();
                    double R5 = sd.leerdatoR5();
                    double R6 = sd.leerdatoR6();
                    System.out.println("La Resistencia Total en Serie es: " + bus.ResistenciaSerie1(R1, R2, R3, R4, R5, R6));
                }
                case 14 -> {
                    double R1 = sd.leerdatoR1();
                    double R2 = sd.leerdatoR2();
                    double R3 = sd.leerdatoR3();
                    double R4 = sd.leerdatoR4();
                    double R5 = sd.leerdatoR5();
                    double R6 = sd.leerdatoR6();
                    System.out.println("La Resistencia Total en Paralelo es: " + baas.ResistenciaParalelo1(R1, R2, R3, R4, R5, R6));
                }
                case 15 -> {
                    int b1 = dc.leerBanda(1);
                    int b2 = dc.leerBanda(2);
                    int b3 = dc.leerBanda(3);
                    int b4 = dc.leerTolerancia();
                    double resultado = colores.coloresAOhms(b1, b2, b3);
                    System.out.println("Valor de la resistencia: " + resultado + " Ohms");
                    System.out.println("Tolerancia: " + colores.obtenerTolerancia(b4));
                }
                case 16 -> {
                    double ohms = dc.leerOhms();
                    int[] bandas = colores.ohmsAColores(ohms);
                    System.out.println("Banda 1: " + colores.nombreColor(bandas[0]));
                    System.out.println("Banda 2: " + colores.nombreColor(bandas[1]));
                    System.out.println("Banda 3 (multiplicador): " + colores.nombreColor(bandas[2]));
                }
                case 17 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opcion no válida");
            }
        } while (opcion != 17);
    }
}
