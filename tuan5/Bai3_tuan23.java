package tuan5;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai3_tuan23 extends Application{
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
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
		VBox layout=new VBox();
		layout.setSpacing(20);
		layout.getChildren().addAll(problem,result);
		Scene scene = new Scene(layout,600,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();
	}
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i = 2;i<n;i++) if(n%i==0) return false;
    	return true;
    }}
