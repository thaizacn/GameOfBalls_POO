public class Game {
    private Computer computer;
    private Target target;

    public Game(Computer computer) {
        this.computer = computer;
        this.target = computer.getTarget();
    }

    public void validateGuess(Guess guess) {
        if (guess.getValue() == target.getNumber()) {
            System.out.println("Parabéns CAMPEÃO! O alvo era: " + target.getNumber() + ". Você VENCEU!");
            System.exit(0);
        } else {
            System.out.println("Você errou! O valor do alvo era " + target.getNumber() + ".");
            Retry retry = new Retry(computer);
            retry.retryGame();
        }
    }
}
