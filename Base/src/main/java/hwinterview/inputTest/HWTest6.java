package hwinterview.inputTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @author: Tong
 * @date: 2020-07-15 11:20
 */
public class HWTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String currStr = sc.nextLine();
            String[] strings = currStr.split(" ");
            System.out.println(Arrays.stream(strings).map(Integer::parseInt).reduce(0, Integer::sum));
        }
    }
}
