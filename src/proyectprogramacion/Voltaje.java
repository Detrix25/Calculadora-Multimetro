package proyectprogramacion;

public class Voltaje {

    public double R;
    public double I;
    public double P;
    private double V;
    
    public Voltaje() {
        R = 0;
        I = 0;
        P = 0;
        V = 0;
    }
    
    public Voltaje(double r, double i, double p) {
        R = r;
        I = i;
        P = p;
        V = VoltajeMetodoRI(r, i);
    }
    
    public double VoltajeMetodoRI(double r, double i) {
        return r * i;
    }

    public double VoltajeMetodoPI(double p, double i) {
        return p / i;
    }

    public double VoltajeMetodoRP(double r, double p) {
        return Math.sqrt(p * r);
    }
    
    public double getV() {
        return V;
    }
    
    public void setV(double v) {
        V = v;
    }
    
    public void mostrarDatos() {
        System.out.println("=== Voltaje ===");
        System.out.println("R: " + R + " | I: " + I + " | P: " + P + " | V: " + V);
    }
}
