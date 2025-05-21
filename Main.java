import java.util.ArrayList;

public class Main {

    // Função que mostra raio e diâmetro das circunferências
    public static void mostrarRaiosEDiametros(ArrayList<FormaGeometrica> formas) {
        System.out.println("=== Circunferências detectadas ===");
        for (FormaGeometrica forma : formas) {
            if (forma instanceof Circunferencia) {
                Circunferencia c = (Circunferencia) forma;
                System.out.println("Raio: " + c.getRaio() + ", Diâmetro: " + c.getDiametro());
            }
        }
    }

    public static void main(String[] args) {
        // Lista de formas geométricas
        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        // Adicionando as figuras geométricas
        formas.add(new Circunferencia(5));
        formas.add(new Retangulo(4, 6));
        formas.add(new Triangulo(3, 4, 5));
        formas.add(new Pentagono(7));
        formas.add(new Circunferencia(10)); // mais uma circunferência

        // Exibir área e perímetro de cada forma
        for (FormaGeometrica f : formas) {
            System.out.println("Forma: " + f.getClass().getSimpleName());
            System.out.printf("Área: %.2f\n", f.getArea());
            System.out.printf("Perímetro: %.2f\n", f.getPerimetro());
            System.out.println("------");
        }

        // Mostrar dados específicos das circunferências
        mostrarRaiosEDiametros(formas);
    }
}
