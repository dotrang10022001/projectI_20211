package tuan2;
import java.util.Scanner;
public class Bai10 {
	public static void main(String[] args) {
		int N;
		System.out.print("Nhap N: ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		System.out.print("Cac uoc nguyen to cua " + N + " la: ");
		for(int i=2;i<=N;i++)
		if(N%i==0) {
			if(isPrime(i)) System.out.print(i+" ");
		}
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
    public static boolean isPrime(int n) {
    	if(n<2)return false;
    	for(int i = 2;i<n;i++) if(n%i==0) return false;
    	return true;
    }
}
