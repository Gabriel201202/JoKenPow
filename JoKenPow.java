import java.util.Random;
import java.util.Scanner;

public class ex7 {
  public static void main(String[] args) {
    int player, valor;
    Random maquina = new Random();
    
    try (Scanner jogo = new Scanner(System.in)) {
      System.out.print("Bem vindo ao JoKenPow!\n\nQual objeto abaixo deseja escolher?\n1-Pedra\n2-Papel\n3-Tesoura\n");
      player = jogo.nextInt();
      valor = maquina.nextInt(3)+1;

      //Empete
      if (player == valor) {
        System.out.print("Empate");
      //Pedra
      } else if (player == 1 && valor != 2) {
        System.out.print("Você: Pedra\nMaquina: Tesoura\n\nVocê ganhou");
      } else if (player != 2 && valor == 1) {
        System.out.print("Você: Tesoura\nMaquina: Pedra\n\nVocê perdeu");
      //Papel
      } else if (player == 2 && valor != 3) {
        System.out.print("Você: Papel\nMaquina: Pedra\n\nVocê ganhou");
      } else if (player != 3 && valor == 2) {
        System.out.print("Você: Pedra\nMaquina: Papel\n\nVocê perdeu");
      //Tesoura
      } else if (player == 3 && valor != 1) {
        System.out.print("Você: Tesoura\nMaquina: Papel\n\nVocê ganhou");
      } else if (player != 1 && valor == 3) {
        System.out.print("Você: Papel\nMaquina: Tesoura\n\nVocê perdeu");
      } 
    }
  }
}