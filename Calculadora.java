package CalculadoraComMenuInterativo;

import java.util.Scanner;

public class Calculadora {
    static void main() {
        Scanner leia = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 0);
        double novoNum = 0;

        do {
            System.out.println("=== CALCULADORA ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leia.nextInt();

            double num1, num2, resultado, subOpcao =0;
            switch (opcao) {

                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = leia.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = leia.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    while (subOpcao != 0)
                        if (subOpcao == 1) {
                        }
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = leia.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = leia.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);

                    System.out.print("Digite o primeiro número: ");
                    num1 = leia.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = leia.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    while (subOpcao != 0)
                        if (subOpcao == 1) {

                        }
                    break;

                case 3:
                    System.out.println("Digite o priemiro numero: ");
                    num1 = leia.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    num2 = leia.nextDouble();

                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    } else {
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                    }
                    while (subOpcao != 0)
                        if (subOpcao == 1) {
                        }
                case 4:
                    System.out.println("Digite o primeiro número: ");
                    num1 = leia.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    num2 = leia.nextDouble();
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                    while (subOpcao != 0)
                        if (subOpcao == 1) {
                        }
                    break;

                case 5:
                    System.out.print("Base: ");
                    double base = leia.nextDouble();

                    System.out.print("Expoente (N): ");
                    int exp = leia.nextInt();

                    resultado = Math.pow(base, exp);

                    double resultado2 = 1;
                    for (int i = 0; i < exp; i++) {
                        resultado2 = base;

                    }

                    System.out.println(base + +exp + " = " + resultado);
                    if (base == exp)
                        System.out.println("Resultado = " + resultado);
                    while (subOpcao != 0)
                        if (subOpcao == 1) {
                        }
                    break;

                case 0:
                    if (opcao == 0);
                    System.out.println("Obrigado por usar nossa calculadora!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        {
}

leia.close();
        System.out.println("Até logo!");
    }
}