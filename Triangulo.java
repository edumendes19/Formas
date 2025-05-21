public class Triangulo implements FormaGeometrica {
    private double a, b, c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimetro() {
        return a + b + c;
    }

    public double getPerimetro(boolean arredondar) {
        double p = getPerimetro();
        return arredondar ? Math.round(p) : p;
    }

    @Override
    public double getArea() {
        double s = getPerimetro() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getArea(double fator) {
        return getArea() * fator;
    }
}
