package proyectprogramacion;

public class Resistencia {

    public double V;
    public double I;
    private double P;
    
    public Resistencia() {
        V = 0;
        I = 0;
        P = 0;
    }
    
    public Resistencia(double v) {
        V = v;
    }
    
    public Resistencia(double p, double i) {
        P = p;
        I = i;
        V = PotenciaYCorriente(p, i);
    }
    
    public double VoltajeYCorriente(double v, double i) {
        return v / i;
    }

    public double VoltajeYPotencia(double v, double p) {
        return Math.pow(v, 2) / p;
    }

    public double PotenciaYCorriente(double p, double i) {
        return p / Math.pow(i, 2);
    }
    
    public double getP() {
        return P;
    }
    
    public void setP(double p) {
        P = p;
    }
    
    public void Valores(double v, double i, double p) {
        V = v;
        I = i;
        P = p;
    }
    
    public void mostrarDatos() {
        System.out.println("=== Resistencia ===");
        System.out.println("Voltaje: " + V);
        System.out.println("Corriente: " + I);
        System.out.println("Potencia: " + P);
    }
}
