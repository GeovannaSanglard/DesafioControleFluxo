// src/Contador.java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            int primeiroNumero = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int segundoNumero = scanner.nextInt();

            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int interacoes = segundoNumero - primeiroNumero;
        for (int i = 1; i <= interacoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}