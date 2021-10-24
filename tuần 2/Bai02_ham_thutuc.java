package tuan2;
import java.util.Scanner;
public class Bai02_ham_thutuc {
	public static void main(String[] args) {
		int N;
		double S=0.0;
		System.out.print("Nhap so tu nhien N: ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		for(int i=1;i<=N;i++) S+=1.0/tinhGiaiThua(i);
		System.out.println("Tong S = " + S);
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
    public static long tinhGiaiThua(int n) {
    	long giaiThua = 1;
    	for(int i=1;i<=n;i++) giaiThua*=i;
    	return giaiThua;
    }
}
