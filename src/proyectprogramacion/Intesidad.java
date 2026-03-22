package proyectprogramacion;

public class Intesidad {

    public double R;
    public double V;
    public double P;
    private double I;
    
    public Intesidad() {
        R = 0;
        V = 0;
        P = 0;
        I = 0;
    }
    
    public Intesidad(double r, double v, double p) {
        R = r;
        V = v;
        P = p;
        I = IntensidadMetodoVR(r, v);
    }
    
    public double IntensidadMetodoPR(double p, double r) {
        return Math.sqrt(p / r);
    }

    public double IntensidadMetodoPV(double p, double v) {
        return p / v;
    }

    public double IntensidadMetodoVR(double r, double v) {
        return v / r;
    }
    
    public double getI() {
        return I;
    }
    
    public void setI(double i) {
        I = i;
    }
    
    public void mostrarDatos() {
        System.out.println("=== Intensidad ===");
        System.out.println("R: " + R + " | V: " + V + " | P: " + P + " | I: " + I);
    }
}
