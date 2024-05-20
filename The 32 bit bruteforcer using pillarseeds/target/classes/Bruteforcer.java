import java.util.Random;

public class Bruteforcer{
    public static void main(String[]args){
        long worldseed = 0;
        while (worldseed < 4294967296L) {
            Random rand = new Random(worldseed);
            long pillarseed = rand.nextLong() & 65535L;
            if (pillarseed == 52056) {
                System.out.println(worldseed);
            }
            worldseed = worldseed + 1;
        }
    }
}


