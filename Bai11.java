package tuan2;
import java.util.Random;
import java.util.Scanner;
public class Bai11 {
	public static void main(String[] args) {
		int N;
		System.out.print("Nhap so tu nhien N(>1): ");
		Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    int A[] = new int[N];
	    System.out.print("Nhap vao 1 day so gom " + N + " so: ");
	    for(int i=0;i<N;i++) A[i] = sc.nextInt();
	    sc.close();
	    Random r = new Random();
	    int m = r.nextInt(N), n = r.nextInt(N);
	    int t = A[m];
	    A[m] = A[n];
	    A[n] = t;
	    System.out.print("Day sau khi trao doi 2 vi tri "+m+" va "+n+" la: ");
	    for(int i=0;i<N;i++) System.out.print(A[i]+ " ");
	    System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
}
