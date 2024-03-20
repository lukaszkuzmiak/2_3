import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int sum = 0;

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(101); 
            System.out.println("Losowe liczby  " + (i + 1) + ": " + num);
            sum += num;
        }

        System.out.println("Suma tych pięciu cyfr  " + sum);
    }
}