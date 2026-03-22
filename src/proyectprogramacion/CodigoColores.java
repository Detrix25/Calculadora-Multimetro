package proyectprogramacion;

public class CodigoColores {

    private static final String[] COLORES = {
        "Negro", "Cafe", "Rojo", "Naranja", "Amarillo",
        "Verde", "Azul", "Violeta", "Gris", "Blanco"
    };

    private double ultimoResultado; 

    public CodigoColores() {
        ultimoResultado = 0;
    }

    public CodigoColores(double resultado) {
        ultimoResultado = resultado;
    }

    public double getUltimoResultado() {
        return ultimoResultado;
    }

    public void setUltimoResultado(double r) {
        ultimoResultado = r;
    }

    public double coloresAOhms(int banda1, int banda2, int multiplicador) {
        double valor = (banda1 * 10 + banda2) * Math.pow(10, multiplicador);
        ultimoResultado = valor;
        return valor;
    }

    public String obtenerTolerancia(int banda4) {
        return switch (banda4) {
            case 1 ->
                "+-1% (Cafe)";
            case 2 ->
                "+-2% (Rojo)";
            case 5 ->
                "+-0.5% (Verde)";
            case 6 ->
                "+-0.25% (Azul)";
            case 7 ->
                "+-0.1% (Violeta)";
            case 10 ->
                "+-5% (Dorado)";
            case 11 ->
                "+-10% (Plateado)";
            default ->
                "Tolerancia no valida";
        };
    }

    public int[] ohmsAColores(double ohms) {
        int exponente = (int) Math.floor(Math.log10(ohms)) - 1;
        int valor = (int) Math.round(ohms / Math.pow(10, exponente));
        int banda1 = valor / 10;
        int banda2 = valor % 10;
        return new int[]{banda1, banda2, exponente};
    }

    public String nombreColor(int numero) {
        if (numero >= 0 && numero <= 9) {
            return COLORES[numero];
        }
        return "Invalido";
    }

    public void mostrarUltimoResultado() {
        System.out.println("Ultimo resultado: " + ultimoResultado + " Ohms");
    }
}
