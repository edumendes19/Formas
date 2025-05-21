public class Retangulo implements FormaGeometrica {
    private double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return largura * altura;
    }

    public double getArea(double fator) {
        return largura * altura * fator;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largura + altura);
    }

    public double getPerimetro(boolean arredondar) {
        double perimetro = 2 * (largura + altura);
        return arredondar ? Math.round(perimetro) : perimetro;
    }
}
