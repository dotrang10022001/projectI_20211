package tuan4;
import java.util.Scanner;
public class Bai14 {
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap vao so tu nhien n(>=1): ");
		n=sc.nextInt();
		sc.close();
		System.out.println("Xau Sn la: "+S(n));
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
    public static String S(int n) {
    	if(n==1) return "1111100000";
    	return traoDoi(S(n-1));
    }
    public static String traoDoi(String s) {
    	char c[]=s.toCharArray();
    	for(int i=0;i<c.length-1;i++) {
    		char t=c[i];
    		c[i]=c[i+1];
    		c[i+1]=t;
    	}
    	return String.valueOf(c);
    }
}
