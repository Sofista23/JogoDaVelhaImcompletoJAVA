package codigoPrincipal;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        limpaConsole();

        menu();

        String nomeJogadorX = nomeDeX();
        System.out.println();
        String nomeJogadorO = nomeO();

        char jogo[][] = new char[3][3];
        for (int l = 0 ; l <3 ; l++) {
            for (int c = 0 ; c <3 ; c++) {
                jogo[l][c] = ' ';
            }
        }

        boolean ganhouX = false;
        boolean ganhouO = false;
        int contador = 0;

        while (true) {
            Scanner teclado = new Scanner(System.in);
            limpaConsole();

            imprimeEstrutura(jogo[0][0], jogo[0][1], jogo[0][2], jogo[1][0], jogo[1][1], jogo[1][2], jogo[2][0], jogo[2][1], jogo[2][2]);

            System.out.printf("%s, jogue, linha - coluna: ", nomeJogadorX);
            int num1x = teclado.nextInt();
            int num2x = teclado.nextInt();
            jogo[num1x-1][num2x-1] = 'X';

            for (int c = 0 ; c < jogo.length ; c++) {
                if (jogo[c][0] == 'X' && jogo[c][1] == 'X' && jogo[c][2] == 'X') {
                    limpaConsole();
                    System.out.printf("%s, GANHOU!", nomeJogadorX);
                    ganhouX = true;
                } else if (jogo[0][c] == 'X' && jogo[1][c] == 'X' && jogo[2][c] == 'X') {
                    limpaConsole();
                    System.out.printf("%s, GANHOU!", nomeJogadorX);
                    ganhouX = true;
                }
            }
            if (jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X') {
                limpaConsole();
                System.out.printf("%s, GANHOU!", nomeJogadorX);
                ganhouX = true;
            } else if (jogo[0][2] == 'X' && jogo[1][1] == 'X' && jogo[2][0] == 'X') {
                limpaConsole();
                System.out.printf("%s, GANHOU!", nomeJogadorX);
                ganhouX = true;
            }
            if (ganhouX == true) {
                break;
            }
            
            limpaConsole();   

            imprimeEstrutura(jogo[0][0], jogo[0][1], jogo[0][2], jogo[1][0], jogo[1][1], jogo[1][2], jogo[2][0], jogo[2][1], jogo[2][2]);


            System.out.printf("%s, jogue, linha - coluna: ", nomeJogadorO);
            int num1o = teclado.nextInt();
            int num2o = teclado.nextInt();
            jogo[num1o-1][num2o-1] = 'O';

            for (int c = 0 ; c < jogo.length ; c++) {
                if (jogo[c][0] == 'O' && jogo[c][1] == 'O' && jogo[c][2] == 'O') {
                    limpaConsole();
                    System.out.printf("%s, GANHOU!", nomeJogadorO);
                    ganhouO = true;
                } else if (jogo[0][c] == 'O' && jogo[1][c] == 'O' && jogo[2][c] == 'O') {
                    limpaConsole();
                    System.out.printf("%s, GANHOU!", nomeJogadorO);
                    ganhouO = true;
                }
            }
            if (jogo[0][0] == 'O' && jogo[1][1] == 'O' && jogo[2][2] == 'O') {
                limpaConsole();
                System.out.printf("%s, GANHOU!", nomeJogadorO);
                ganhouO = true;
            } else if (jogo[0][2] == 'O' && jogo[1][1] == 'O' && jogo[2][0] == 'O') {
                limpaConsole();
                System.out.printf("%s, GANHOU!", nomeJogadorO);
                ganhouO = true;
            }
            if (ganhouO == true) {
                break;
            }
        }
    }

    private static void limpaConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void menu() {
        System.out.println("Jogo da Velha");
        System.out.println("-------------");
    }

    private static String nomeDeX() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome JogadorX: ");
        return teclado.nextLine();

    }
    private static String nomeO() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome JogadorO: ");
        return teclado.nextLine();
    }

    private static void imprimeEstrutura(char j00, char j01, char j02, char j10, char j11, char j12, char j20, char j21, char j22) {
            System.out.println("   1   2   3");
            System.out.printf("1  %s | %s | %s %n", j00, j01, j02);
            System.out.println("  ---+---+---");
            System.out.printf("2  %s | %s | %s %n", j10, j11, j12);
            System.out.println("  ---+---+---");
            System.out.printf("3  %s | %s | %s %n", j20, j21, j22);
    }
}