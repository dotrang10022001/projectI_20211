package tuan5;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai5_tuan23 extends Application{
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 05: In ra màn hình các số nằm giữa 1000 và 2000 "
				+ "đồng thời chia hết cho 3,5,7");
		TextArea result= new TextArea();
		result.setEditable(false);
		for(int i=1001;i<2000;i++) {
			if(i%3==0&&i%5==0&&i%7==0) result.appendText(Integer.toString(i)+" ");
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
