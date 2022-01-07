package tuan5;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
public class Bai1_ham_thutuc_tuan23 extends Scene{
	public Bai1_ham_thutuc_tuan23() {
		super(new Layout(),400,250);
	}
	public static class Layout extends VBox {
		public Layout() {
			Label problem = new Label("Bài 01: Cho số tự nhiên N bất kỳ.\n"
					+ "Tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N)");
			Label label1= new Label("Nhập N: ");
			TextField text= new TextField();text.setMaxWidth(50);
			Label label2= new Label("Tổng S:");
			TextField result=new TextField();result.setEditable(false);result.setMaxWidth(100);
			text.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					int N=Integer.parseInt(text.getText());Float S=0f;
					for(int i=1;i<=N;i++) S+=1.0f/tinhTong(i);
					result.setText(Float.toString(S));}
			});
		    setSpacing(20);
			getChildren().addAll(problem,label1,text,label2,result);
		}
	}
	public static long tinhTong(int n) {
    	long tong=0;
    	for(int i=1;i<=n;i++) tong+=i;
    	return tong;
    }
}
