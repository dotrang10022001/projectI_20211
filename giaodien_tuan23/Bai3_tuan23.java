package tuan5;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class Bai3_tuan23 extends Scene{
	public Bai3_tuan23() {
		super(new Layout(),600,300);
	}
	public static class Layout extends VBox {
		public Layout() {
			Label problem = new Label("Bài 03: In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000");
			TextArea result= new TextArea();
			result.setEditable(false);
			int count=0;
			for(int i=1000; i<=2000; i++)
			if(isPrime(i)) {
				result.appendText(Integer.toString(i)+"  ");
				count++;
				if(count==16) {result.appendText("\n");count = 0;}
			}
			setSpacing(20);
			getChildren().addAll(problem,result);
		}
	}
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i = 2;i<n;i++) if(n%i==0) return false;
    	return true;
    }
}
