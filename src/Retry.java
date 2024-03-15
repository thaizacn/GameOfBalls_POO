import java.util.Random;

public class Retry {
    private Computer computer;
    private Target target;

    public Retry(Computer computer) {
        this.computer = computer;
        this.target = computer.getTarget();
    }

    public void retryGame() {
        if(target.getNumber() <= 100) {
            computer.setNewTarget();
            System.out.println("Um novo alvo foi definido!");
        } else {
            System.out.println("O valor do alvo foi igual ou maior a 100. Sinto muito, o computador venceu essa partida!");
            System.out.println("Obrigado por jogar! Até a próxima!");
            System.exit(0);
        }
    }
}
