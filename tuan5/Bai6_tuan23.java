package tuan5;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai6_tuan23 extends Application{
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
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
		VBox layout=new VBox();
		layout.setSpacing(20);
		layout.getChildren().addAll(problem,result);
		Scene scene = new Scene(layout,600,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();
	}
}
