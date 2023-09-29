package faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        System.out.println("Cadastro de Coordenadores");

        List<Coordenador> coordenadores = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Coordenador novoCoordenador = Coordenador.criarNovoCoordenadorViaConsole();
            coordenadores.add(novoCoordenador);
        }

        for (Coordenador coordenador : coordenadores) {
            coordenador.imprimirDados();
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Deseja cadastrar mais um coordenador? (s/n)");
            String resposta = scanner.nextLine().toLowerCase();
            if (resposta.equals("s")) {
                Coordenador novoCoordenador = Coordenador.criarNovoCoordenadorViaConsole();
                coordenadores.add(novoCoordenador);
                novoCoordenador.imprimirDados();
            } else if (resposta.equals("n")) {
                break;
            }
        }
    }
}
