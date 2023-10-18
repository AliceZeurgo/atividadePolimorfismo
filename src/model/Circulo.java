package model;

public class Circulo {
    public Circulo(double raio) {
    }

    public String calcularArea() {
        return null;
    }

    public String calcularPerimetro() {
        return null;
    }

    public class Circulo1 implements FormaGeome {
        private double raio;

        public Circulo1(double raio) {
            this.raio = raio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * raio * raio;
        }

        @Override
        public double calcularPerimetro() {
            return 2 * Math.PI * raio;
        }
    }
}
