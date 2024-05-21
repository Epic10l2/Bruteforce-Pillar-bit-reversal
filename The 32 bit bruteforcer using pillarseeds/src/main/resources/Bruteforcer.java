import java.util.ArrayList;
import java.util.Random;
public class Bruteforcer{
    public static void main(String[]args){
        long worldseed = 0;
        long outcount = 0;
        while (worldseed < 4294967296L) {
            long randomInternalState1 = (worldseed ^ 25214903917L) % 281474976710656L;
            long randomInternalState2 = (randomInternalState1 * 25214903917L + 11L) % 281474976710656L;
            long randomInternalState3 = (randomInternalState2 * 25214903917L + 11L) % 281474976710656L;
            long nextLongLower32Bits2 = randomInternalState3/65536L;
            long nextLongOutput2 = nextLongLower32Bits2 * 4294967296L + nextLongLower32Bits2;
            long pillarseed = nextLongOutput2 % 65536L;
            if (pillarseed == 39974) {
                System.out.println(worldseed);
            }
            worldseed = worldseed + 1;
        }
    }
}
