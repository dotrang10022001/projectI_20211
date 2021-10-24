package tuan2;

public class Bai01 {
	public static void main(String[] args) {
		int counter=0;
		for(int i=2; i<100; i++) {
			if(!isPrime(i)) {
				System.out.printf("%-4d",i);
				counter++;
				if(counter==10) {System.out.println();counter=0;}
			}
		}
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i = 2;i<n;i++) if(n%i==0) return false;
    	return true;
    }
}
