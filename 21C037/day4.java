import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[] l = new int[n];

        st = new StringTokenizer(br.readLine());
        l[0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            l[i] = l[i - 1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a != 1) {
                result.append(l[b - 1] - l[a - 2]).append("\n");
            } else {
                result.append(l[b - 1]).append("\n");
            }
        }

        System.out.print(result);
    }
}
