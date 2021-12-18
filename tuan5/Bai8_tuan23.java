package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai8_tuan23 extends Application{
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
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
				if(N%i==0) 
				if(isPrime(i)) {result.setText(Integer.toString(i));break;}
			}});
	    VBox layout=new VBox();
		layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text,label2,result);
		Scene scene = new Scene(layout,600,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();
	}
	public static boolean isPrime(int n) {
		if(n<2)return false;
    	for(int i = 2;i<n;i++) if(n%i==0) return false;
    	return true;
    }
}
