package tuan2;

public class Bai06 {
	public static void main(String[] args) {
		long sum = 0;
	    int number = 0,n=1;
	    System.out.println("20194188 Do Thi Thuy Trang-709155");
		while(number<5) {
			for(int i=1;i<n;i++) if(n%i==0) sum+=i;
			if(sum==n) {
				System.out.println(n);
				number++;
			}
			sum = 0;
			n++;
		}
	}
}
