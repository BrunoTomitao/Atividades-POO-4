package faculdade;

import java.util.Scanner;

public class Coordenador {

    private String nome;
    private String curso;
    private String turno;

    public Coordenador(String nome, String curso, String turno) {
        this.nome = nome;
        this.curso = curso;
        this.turno = turno;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Turno: " + turno);
    }

    public static Coordenador criarNovoCoordenadorViaConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do coordenador:");
        String nome = scanner.nextLine();

        System.out.println("Digite o curso do coordenador:");
        String curso = scanner.nextLine();

        System.out.println("Digite o turno do coordenador:");
        String turno = scanner.nextLine();

        return new Coordenador(nome, curso, turno);
    }
}
