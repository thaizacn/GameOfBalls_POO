public class Computer {
    private Target target = new Target(0);
    private Urn urn = new Urn(); // Inicializa a urna

    public void setTarget() {
        urn.addBall(); // Adiciona as bolas na urna
        Ball ball = urn.returnBall();
        target.setNumber(ball.getBall());
    }

    public void setNewTarget() {
        Ball ball = urn.returnBall();
        int newValue = target.getNumber() + ball.getBall(); // Soma o valor da última bola com o valor atual do alvo
        target.setNumber(newValue); // Define o novo valor do alvo
    }

    public Target getTarget() {
        return target;
    }
}
