import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RobotCollisions {
    private static List<Integer> robots(int posi[], int h[], String directions) {
        List<Integer> ans = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        List<int[]> robots = new ArrayList<>();
        for (int i = 0; i < posi.length; i++) {
            robots.add(new int[] { posi[i], h[i], directions.charAt(i) });
            // System.out.print(robots);
        }
        System.out.println(robots);
        return ans;
    }

    public static void main(String[] args) {
        int positions[] = { 5, 4, 3, 2, 1 };
        int healths[] = { 2, 17, 9, 15, 10 };
        String directions = "RRRRR";
        List<Integer> ans = robots(positions, healths, directions);

    }
}
