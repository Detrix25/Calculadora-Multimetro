package proyectprogramacion;

public class Potencia {

    public double R;
    public double I;
    public double V;
    private double P;
    
    public Potencia() {
        R = 0;
        I = 0;
        V = 0;
        P = 0;
    }
    
    public Potencia(double r, double i, double v) {
        R = r;
        I = i;
        V = v;
        P = PotenciaMetodoVI(v, i);
    }
    
    public double PotenciaMetodoVR(double r, double v) {
        return (v * v) / r;
    }

    public double PotenciaMetodoRI(double r, double i) {
        return r * Math.pow(i, 2);
    }

    public double PotenciaMetodoVI(double v, double i) {
        return v * i;
    }
    
    public double getP() {
        return P;
    }
    
    public void setP(double p) {
        P = p;
    }
    
    public void mostrarDatos() {
        System.out.println("=== Potencia ===");
        System.out.println("R: " + R + " | I: " + I + " | V: " + V + " | P: " + P);
    }
}
