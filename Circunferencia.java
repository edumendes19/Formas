public class Circunferencia implements FormaGeometrica {
    private double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getDiametro() {
        return 2 * raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    public double getArea(double fator) {
        return Math.PI * raio * raio * fator;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getPerimetro(boolean arredondar) {
        double perimetro = 2 * Math.PI * raio;
        return arredondar ? Math.round(perimetro) : perimetro;
    }
}
