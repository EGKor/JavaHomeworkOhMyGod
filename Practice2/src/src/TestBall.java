import java.util.Scanner;

public class TestBall
{
    public static void main(String[] args) {
        Ball Bn = new Ball();
        System.out.println(Bn);
        Bn.move(3.4, 5.6);
        System.out.println("Ball moved to "+ Bn);
    }
}
