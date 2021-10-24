package tuan2;

public class Bai02 {
	static int number = 0;
	public static void main(String[] args) {
		int i = 2;
		while(number<20) {
			if(isPrime(i)) System.out.print(i + " ");
			i++;
		}
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
    public static boolean isPrime(int n) {
    	if(n<2)return false;
    	for(int i = 2;i<n;i++) if(n%i==0) return false;
    	number++;
    	return true;
    }
}
