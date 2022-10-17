import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Zad13 {
    public static void rand(){
        int n =0;
        int k = 0;
        Random rand = new Random();
        int mass [] = new int [4];
        for (int i=0;i<4;i++){
            mass[i]= rand.nextInt(90)+10;
        }
        for (int i=0;i<4;i++){
            if (mass[i]>n){
                n=mass[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(mass));
        if (k==4) {
            System.out.println("Последовательность строго возрастает");
        }
        else{
            System.out.println("Последовательность не является строго возрастающей");
        }
    }

    public static void main(String[] args) {
        rand();
    }
}
