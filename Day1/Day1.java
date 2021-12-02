package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Day1/day1.txt"));
        ArrayList<Integer> arr = new ArrayList<>();
        while (sc.hasNext()) {
            arr.add(sc.nextInt());
        }
        part1(arr);
        part2(arr);
    }

    private static void part1(ArrayList<Integer> input) {
        for (int i=0; i<input.size(); i++) {
            for (int j=i+1; j<input.size(); j++) {
                if (input.get(i) + input.get(j) == 2020) {
                    System.out.printf("Part 1 Solution: %d\n", input.get(i) * input.get(j));
                    return;
                }
            }
        }
    }

    private static void part2(ArrayList<Integer> input) {
        for (int i=0; i<input.size(); i++) {
            for (int j=i+1; j<input.size(); j++) {
                for (int k=j+1; k<input.size(); k++) {
                    if (input.get(i) + input.get(j) + input.get(k) == 2020) {
                        System.out.printf("Part 2 Solution: %d\n", input.get(i) * input.get(j)* input.get(k));
                        return;
                    }
                }
                
            }
        }
    }
}