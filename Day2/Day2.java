package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Day2/day2.txt"));
        ArrayList<String> arr = new ArrayList<>();
        while (sc.hasNext()) {
            arr.add(sc.nextLine());
        }
        part1(arr);
        part2(arr);
    }

    private static void part1(ArrayList<String> input) {
        Pattern pat = Pattern.compile("([0-9]+)-([0-9]+) ([a-z]): ([a-z]+)");
        int output = 0;
        for (String s: input) {
            Matcher mat = pat.matcher(s);
            if (mat.find()) {
                int count = 0;
                for (char c: mat.group(4).toCharArray()) {
                    if (c == mat.group(3).charAt(0)) {count++;}
                }
                if (count >= Integer.parseInt(mat.group(1)) && count <= Integer.parseInt(mat.group(2))) {output++;}
            }
        }
        System.out.printf("Part 1 Solution: %d\n", output);
    }

    private static void part2(ArrayList<String> input) {
        Pattern pat = Pattern.compile("([0-9]+)-([0-9]+) ([a-z]): ([a-z]+)");
        int output = 0;
        for (String s: input) {
            Matcher mat = pat.matcher(s);
            if (mat.find()) {
                if (mat.group(3).charAt(0) == mat.group(4).charAt(Integer.parseInt(mat.group(1)) - 1) ^ mat.group(3).charAt(0) == mat.group(4).charAt(Integer.parseInt(mat.group(2)) - 1)) {
                    output++;
                }
            }
        }
        System.out.printf("Part 2 Solution: %d\n", output);
    }
}