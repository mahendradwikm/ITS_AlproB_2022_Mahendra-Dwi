import java.util.Random;

public class ComputeMethods5026211102 {

    // suhu
    public double fToC (double degreesF) {
        return 5 / 9.0 * (degreesF - 32);
    }

    // phytagoras
    public double hypotenuse (double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    // dice
    public int roll () {

        Random random = new Random();

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 3;

        return dice1 + dice2;
    }
}