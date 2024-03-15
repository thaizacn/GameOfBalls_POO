import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Urn {

    List<Ball> balls;

    public Urn() {
        this.balls = new ArrayList<>();
    }

    public void addBall() {
        for (int i = 1; i <= 20; i++) {
            Ball ball = new Ball(i);
            balls.add(ball);
        }
    }

    public Ball returnBall(){
        if (balls.isEmpty()) {
            System.out.println("A urna está vazia. Por favor, adicione bolas antes de retirar.");
            return null;
        } else {
            Random random = new Random();
            int ballDrawn = random.nextInt(balls.size());
            Ball ball = balls.get(ballDrawn);
            balls.remove(ballDrawn); // Remove a bola sorteada da lista
            return ball;
        }
    }

}
