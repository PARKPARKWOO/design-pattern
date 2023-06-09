package observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int num;

    @Override
    public int getNumber() {
        return num;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            num = random.nextInt(50);
            notifyObserver();
        }
    }
}
