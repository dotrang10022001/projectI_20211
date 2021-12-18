package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai5_tuan34 extends Application{
	int N;
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene;
		Label problem = new Label("Bài 05: Cho một dãy số tự nhiên, "
				+ "\nhãy đếm xem trong dãy số trên có bao nhiêu số nguyên tố, có bao nhiêu hợp số.");
		Label label1= new Label("Nhập số tự nhiên N(>=1): ");
		TextField text1= new TextField();
		text1.setMaxWidth(50);
		Label label2= new Label("Nhập vào N số tự nhiên: ");
		TextField text2=new TextField();
		text2.setMaxWidth(200);
		Label label3= new Label("Số các số nguyên tố có trong dãy là: ");
		TextField text3=new TextField();
		text3.setEditable(false);
	    text3.setMaxWidth(50);
	    Label label4= new Label("Số các hợp số có trong dãy là: ");
		TextField text4=new TextField();
		text4.setEditable(false);
	    text4.setMaxWidth(50);
	    text1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				N=Integer.parseInt(text1.getText());
			}
		});
		text2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				String str=text2.getText();
				String[] s=str.split(" ");
				int A[]=new int[N],number1=0,number2=0;
				for(int k=0;k<N;k++) A[k]=Integer.parseInt(s[k]);
			    for(int k=0;k<N;k++) {
			    	if(isPrime(A[k])) number1++;
			    	else if(A[k]!=0&&A[k]!=1)number2++;
			    }
			    text3.setText(Integer.toString(number1));
			    text4.setText(Integer.toString(number2));
			}
		});
	    VBox layout=new VBox();
		layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text1,label2,text2,label3,text3,label4,text4);
		scene = new Scene(layout,500,450);
		primaryStage.setScene(scene);
		primaryStage.centerOnScreen();
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();
	}
	public static boolean isPrime(int n) {
    	if(n<2)return false;
    	for(int i=2;i<n;i++) if(n%i==0)return false;
    	return true;
    }
}
