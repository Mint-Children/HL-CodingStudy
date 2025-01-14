import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] ary = new int[N];

        for (int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(ary);

        for (int num : ary) {
            bw.write(num + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
