import java.util.Scanner;

public class Planet {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the planet number (1-8): ");
        int x = scn.nextInt();

        String planet;
        switch (x) {
            case 1:
                planet = "Mercury";
                break;
            case 2:
                planet = "Venus";
                break;
            case 3:
                planet = "Earth";
                break;
            case 4:
                planet = "Mars";
                break;
            case 5:
                planet = "Jupiter";
                break;
            case 6:
                planet = "Saturn";
                break;
            case 7:
                planet = "Uranus";
                break;
            case 8:
                planet = "Neptune";
                break;
            default:
                planet = "Invalid planet number";
                break;
        }
        System.out.println(planet);
    }
}
