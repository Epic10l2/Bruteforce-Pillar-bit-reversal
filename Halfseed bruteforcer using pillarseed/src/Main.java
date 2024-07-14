import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //246154705703781l
        Scanner pillarseedinput = new Scanner(System.in);
        System.out.println("Enter Pillarseed: ");
        long pillarseed = pillarseedinput.nextLong();
        long lowerbits = 0l;
        while (lowerbits < 65536){
            long partialrandominternalstate = (pillarseed << 16) + lowerbits;
            long HalfSeed = ((1540035429*(1540035429*partialrandominternalstate+ 239479465)+239479465)^25214903917l)&4294967295l;
            System.out.println(HalfSeed);
            lowerbits += 1;

        }

    }
}