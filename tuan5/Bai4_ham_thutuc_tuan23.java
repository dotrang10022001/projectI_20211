package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai4_ham_thutuc_tuan23 extends Application{
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 04: Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2)."
				+ " \nTính số Fibonaxi thứ N.");
		Label label1= new Label("Nhập N: ");
		TextField text= new TextField();text.setMaxWidth(50);
		Label label2= new Label("Số fibonaxi thứ N là:");
		TextField result=new TextField();
		result.setEditable(false);result.setMaxWidth(100);
		text.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				int N=Integer.parseInt(text.getText());
				result.setText(Integer.toString(fibonaxi(N)));}
		});
	    VBox layout=new VBox();
		layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text,label2,result);
		Scene scene = new Scene(layout,400,250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();
	}
	public static int fibonaxi(int n) {
    	if(n==1||n==2)return 1;return fibonaxi(n-1)+fibonaxi(n-2);}}
