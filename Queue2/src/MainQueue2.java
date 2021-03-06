import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Queue2 {
    private int[] queue;
    private int front = 0;
    private int back = -1;

    Queue2() {
    }

    Queue2(int number) {
        queue = new int[number];
    }

    public void push(int x) {
        queue[++back] = x;
    }

    public int size() {
        return back - front + 1;
    }

    public int isEmpty() {
        if (size() == 0) return 1;
        else return 0;
    }

    public int pop() {
        if (isEmpty() == 1) return -1;
        else return queue[front++];
    }

    public int front() {
        if (isEmpty() == 1) return -1;
        else return queue[front];
    }

    public int back() {
        if (isEmpty() == 1) return -1;
        else return queue[back];
    }

}

public class MainQueue2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 0;
        String order = "";

        Card q = null;
        while ((n < 1) || (n > 2000000)) {
            n = Integer.parseInt(br.readLine());
            if ((n > 0) || (n < 2000001)) {
                q = new Card(n);
            }
        }

        for (int i = 0; i < n; i++) {

            order = br.readLine();

            if (order.contains("push")) {

                String split[] = order.split(" ");
                int e = Integer.parseInt(split[1]);

                q.push(e);
            }
            if (order.contains("pop"))
                bw.write(String.valueOf(q.pop()) + "\n");
            if (order.contains("size"))
                bw.write(String.valueOf(q.size()) + "\n");
            if (order.contains("empty"))
                bw.write(String.valueOf(q.isEmpty()) + "\n");
            if (order.contains("front"))
                bw.write(String.valueOf(q.front()) + "\n");
            if (order.contains("back"))
                bw.write(String.valueOf(q.back()) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}