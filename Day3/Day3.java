package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Day3/day3.txt"));
        ArrayList<String> arr = new ArrayList<>();
        while (sc.hasNext()) {
            arr.add(sc.nextLine());
        }
        part1(arr);
        part2(arr);
    }

    private static void part1(ArrayList<String> input) {
        System.out.printf("Part 1 Solution: %d\n", slope(1, 3, input));
    }

    private static void part2(ArrayList<String> input) {
        long output = slope(1, 1, input) * slope(1, 3, input) * slope(1, 5, input) * slope(1, 7, input) * slope(2, 1, input);
        System.out.printf("Part 2 Solution: %d\n", output);
    }

    private static long slope(int down, int right, ArrayList<String> input) {
        int output = 0;
        int r = right;
        for (int d=down; d<input.size(); d+=down) {
            if (input.get(d).charAt(r % input.get(d).length()) == '#') {output++;}
            r += right;
        }
        return output;
    }
}
