import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int top = -1;

        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            String[] tokens = command.split(" ");
            if (tokens[0].equals("push")) {
                top++;
                stack[top] = Integer.parseInt(tokens[1]);
            } else if (tokens[0].equals("pop")) {
                if (top == -1) bw.write("-1\n");
                else {
                    bw.write(stack[top] + "\n");
                    top--;
                }
            } else if (tokens[0].equals("size")) {
                bw.write((top + 1) + "\n");
            } else if (tokens[0].equals("empty")) {
                if (top == -1) bw.write("1\n");
                else bw.write("0\n");
            } else if (tokens[0].equals("top")) {
                if (top == -1) bw.write("-1\n");
                else bw.write(stack[top] + "\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
