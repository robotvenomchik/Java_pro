package Homeworks.Homework16;

import java.util.Random;

public class RandomNumberGenerator {
    static int generateRandom(int a, int b){
        Random random= new Random();
      return random.nextInt(a,b);
    };
}
