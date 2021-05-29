import java.util.Queue;
import java.util.LinkedList;
 
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Queue<Integer> q = new LinkedList<>();
		
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++)
			q.offer(i);
		
		
		while(q.size()>1) {
			q.poll();	// REMOVE first card
			q.offer(q.poll());	// MOVE
		}
		
		System.out.println(q.poll());
        scanner.close();
	}
}