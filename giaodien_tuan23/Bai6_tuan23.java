package tuan5;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
public class Bai6_tuan23 extends Scene{
	public Bai6_tuan23() {
		super(new Layout(),600,200);
	}
	public static class Layout extends VBox {
		public Layout() {
			Label problem = new Label("Bài 06: In ra màn hình 5 số hoàn hảo đầu tiên "
					+ "(Số hoàn hảo là số có tổng bằng các ước số của mình kể cả 1)");
			TextArea result= new TextArea();
			result.setEditable(false);
			long sum = 0;
		    int number = 0,n=1;
			while(number<5) {
				for(int i=1;i<n;i++) if(n%i==0) sum+=i;
				if(sum==n) {
					result.appendText(Integer.toString(n)+" ");;
					number++;
				}
				sum = 0;n++;
			}
			setSpacing(20);
			getChildren().addAll(problem,result);
		}
	}
}
