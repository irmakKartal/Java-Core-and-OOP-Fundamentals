import java.util.Scanner;

/**
 * Coordinate System Quadrant Detector
 * Determines which quadrant or axis a 2D coordinate point (X, Y) falls in.
 */
public class CoordinateSystem {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("=== 2D Coordinate System Detector ===");
        System.out.print("Enter X coordinate: ");
        double x = scn.nextDouble();

        System.out.print("Enter Y coordinate: ");
        double y = scn.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("-> Point (0, 0) is at the Origin.");
        } else if (x == 0) {
            System.out.println("-> Point lies on the " + (y > 0 ? "+Y axis" : "-Y axis") + ".");
        } else if (y == 0) {
            System.out.println("-> Point lies on the " + (x > 0 ? "+X axis" : "-X axis") + ".");
        } else if (x > 0 && y > 0) {
            System.out.println("-> Point (" + x + ", " + y + ") is in Quadrant I (First region).");
        } else if (x < 0 && y > 0) {
            System.out.println("-> Point (" + x + ", " + y + ") is in Quadrant II (Second region).");
        } else if (x < 0 && y < 0) {
            System.out.println("-> Point (" + x + ", " + y + ") is in Quadrant III (Third region).");
        } else {
            System.out.println("-> Point (" + x + ", " + y + ") is in Quadrant IV (Fourth region).");
        }

        scn.close();
    }
}
