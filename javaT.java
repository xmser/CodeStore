import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Exception;

public class  javaT extends Exception{
    public static Scanner sc = new Scanner(System.in);
    public static void main(final String[] args) {
        final ArrayList<Integer> list = new ArrayList<>();
            list.add(9);
            list.add(19);
            list.add(7);
            String name = "liyeqin";
            System.out.println(name);
            System.out.println(list);
            int temp = sc.nextInt();
            list.add(temp);
            System.out.println(list);
    }
}