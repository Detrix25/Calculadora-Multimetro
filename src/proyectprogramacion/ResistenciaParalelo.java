package proyectprogramacion;

public class ResistenciaParalelo {

    public double R1;
    public double R2;
    public double R3;
    public double R4;
    public double R5;
    public double R6;
    private double RT;
    
    public ResistenciaParalelo() {
        R1 = 0; R2 = 0; R3 = 0;
        R4 = 0; R5 = 0; R6 = 0;
        RT = 0;
    }
    
    public ResistenciaParalelo(double r1, double r2, double r3, double r4, double r5, double r6) {
        R1 = r1; R2 = r2; R3 = r3;
        R4 = r4; R5 = r5; R6 = r6;
        RT = ResistenciaParalelo1(r1, r2, r3, r4, r5, r6);
    }
    
    public double ResistenciaParalelo1(double r1, double r2, double r3, double r4, double r5, double r6) {
        return Math.pow((1 / r1) + (1 / r2) + (1 / r3) + (1 / r4) + (1 / r5) + (1 / r6), -1);
    }
    
    public double getRT() {
        return RT;
    }
    
    public void setRT(double rt) {
        RT = rt;
    }
    
    public void mostrarDatos() {
        System.out.println("=== Resistencia Paralelo ===");
        System.out.println("R1: " + R1 + " | R2: " + R2 + " | R3: " + R3);
        System.out.println("R4: " + R4 + " | R5: " + R5 + " | R6: " + R6);
        System.out.println("RT: " + RT);
    }
}
