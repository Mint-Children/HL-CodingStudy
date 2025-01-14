import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        int[] frequency = new int[8001];

        int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
            frequency[numbers[i] + 4000]++;
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }

        Arrays.sort(numbers);

        int mode = findMode(frequency);
        int range = max - min;

        bw.write(Math.round((double) sum / n) + "\n");
        bw.write(numbers[n / 2] + "\n");
        bw.write(mode + "\n");
        bw.write(range + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int findMode(int[] frequency) {
        int maxFreq = 0;
        List<Integer> modes = new ArrayList<>();

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                modes.clear();
                modes.add(i - 4000);
            } else if (frequency[i] == maxFreq) {
                modes.add(i - 4000);
            }
        }

        return modes.size() > 1 ? modes.get(1) : modes.get(0);
    }
}
