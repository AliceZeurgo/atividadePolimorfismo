package model;

import java.util.Scanner;

public class Menu {

        public void startMenu(){
            Scanner scanner = new Scanner(System.in);

            boolean continuar = true;

            while (continuar) {
                System.out.println("Agora escolha uma opção:");
                System.out.println("1- Criar um círculo");
                System.out.println("2- Criar um retângulo");
                System.out.println("3- Sair");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.print("Qual é o raio do círculo: ");
                        double raio = scanner.nextDouble();
                        Circulo circulo = new Circulo(raio);
                        System.out.println("Qual é a aréa do círculo: " + circulo.calcularArea());
                        System.out.println("Qual é o perimetro do círculo: " + circulo.calcularPerimetro());
                    }
                    case 2 -> {
                        System.out.print("Qual é o comprimento do retângulo? ");
                        double comprimento = scanner.nextDouble();
                        System.out.print("Qual é a largura do retângulo? ");
                        double largura = scanner.nextDouble();
                        Retangulo retangulo = new Retangulo(comprimento, largura);
                        System.out.println("Qual é a aréa do retângulo? " + retangulo.calcularArea());
                        System.out.println("Qual é o perimetro do retângulo? " + retangulo.calcularPerimetro());
                    }
                    case 3 -> continuar = false;
                }
            }
        }
    }


