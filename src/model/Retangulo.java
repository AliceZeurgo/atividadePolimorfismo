package model;

public class Retangulo {

    public Retangulo(double comprimento, double largura) {
    }

    public String calcularArea() {
        return null;
    }

    public String calcularPerimetro() {
        return null;
    }

    public class Retangulo1 implements FormaGeome.FormaGeometrica {
        private double comprimento;
        private double largura;

        public Retangulo1(double comprimento, double largura) {
            this.comprimento = comprimento;
            this.largura = largura;
        }

        @Override
        public double calcularArea() {
            return comprimento * largura;
        }

        @Override
        public double calcularPerimetro() {
            return 2 * (comprimento + largura);
        }
    }

}
