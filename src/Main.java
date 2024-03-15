import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer();
        Game game = new Game(computer);

        System.out.println("Bem-vindo ao jogo das bolas!");
        System.out.println("O objetivo do jogo é adivinhar o número do alvo sorteado na urna!");

        boolean continueGame = true;
        computer.setTarget(); // Realiza o primeiro sorteio

        while (continueGame) {
            System.out.print("Digite o seu palpite: ");
            int userGuess = scanner.nextInt();

            Guess guess = new Guess(userGuess);
            game.validateGuess(guess);

            System.out.print("Deseja continuar jogando? (s/n): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("s")) {
                continueGame = false;
                System.out.println("Obrigado por jogar! Até a próxima!");
            }
        }

        scanner.close();
    }
}
