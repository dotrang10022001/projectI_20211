package tuan5;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Bai8_tuan23 extends Scene{
	public Bai8_tuan23() { super(new Layout(),600,200);}
	public static class Layout extends VBox {
		public Layout() {
			Label problem = new Label("Bài 08: Cho số tự nhiên N bất kỳ (đã gán trước đó), "
					+ "tìm và in ra ước số nguyên tố nhỏ nhất của N.");
			Label label1= new Label("Nhập N: ");
			TextField text= new TextField();
			text.setMaxWidth(50);
			Label label2= new Label("Ước số nguyên tố nhỏ nhất của N là: ");
			TextField result=new TextField();
			result.setEditable(false);
			result.setMaxWidth(50);
			text.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					int N=Integer.parseInt(text.getText());
					for(int i=2;i<=N;i++)
					if(N%i==0) if(isPrime(i)) {result.setText(Integer.toString(i));break;}
				}});
		    setSpacing(20);
			getChildren().addAll(problem,label1,text,label2,result);
		}
	}
	public static boolean isPrime(int n) {
		if(n<2)return false;
    	for(int i = 2;i<n;i++) if(n%i==0) return false;
    	return true;
    }
}
