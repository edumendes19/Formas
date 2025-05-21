public class Pentagono implements FormaGeometrica {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double getPerimetro() {
        return 5 * lado;
    }

    public double getPerimetro(boolean arredondar) {
        double p = getPerimetro();
        return arredondar ? Math.round(p) : p;
    }

    @Override
    public double getArea() {
        double apotema = lado / (2 * Math.tan(Math.PI / 5));
        return (5 * lado * apotema) / 2;
    }

    public double getArea(double fator) {
        return getArea() * fator;
    }
}
