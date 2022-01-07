package tuan5;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
public class Bai5_tuan23 extends Scene{
	public Bai5_tuan23() {
		super(new Layout(),600,200);
	}
	public static class Layout extends VBox {
		public Layout() {
			Label problem = new Label("Bài 05: In ra màn hình các số nằm giữa 1000 và 2000 "
					+ "đồng thời chia hết cho 3,5,7");
			TextArea result= new TextArea();
			result.setEditable(false);
			for(int i=1001;i<2000;i++) {
				if(i%3==0&&i%5==0&&i%7==0) result.appendText(Integer.toString(i)+" ");
			}
			setSpacing(20);
			getChildren().addAll(problem,result);
		}
	}
}
