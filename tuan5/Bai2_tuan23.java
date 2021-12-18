package tuan5;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai2_tuan23 extends Application{
	static int number=0;
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 02: In ra màn hình 20 số nguyên tố đầu tiên");
		TextArea result= new TextArea();
		result.setEditable(false);
		int i = 2;
		while(number<20) {
			if(isPrime(i)) result.appendText(Integer.toString(i)+" ");
			i++;
		}
		VBox layout=new VBox();
		layout.setSpacing(20);
		layout.getChildren().addAll(problem,result);
		Scene scene = new Scene(layout,400,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();
	}
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i = 2;i<n;i++) if(n%i==0) return false;
		number++;
    	return true;
    }}
