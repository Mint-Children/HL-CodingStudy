import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Student = sc.nextInt();
        ArrayList<Integer> line = new ArrayList<>();

        for (int i = 0; i < Student; i++) {
            int number = sc.nextInt();
            line.add(line.size() - number, i + 1);
        }

        for(int student : line) {
            System.out.print(student + " ");
        }

        sc.close();
    }
}
