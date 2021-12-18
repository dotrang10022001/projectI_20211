package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai12_tuan23 extends Application{
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene;
		Label problem = new Label("Bài 12: Viết chương trình nhập chiều cao h từ bàn phím, "
				+ "\nsau đó hiển thị các tam giác hình sao có chiều cao h như dưới đây. "
				+ "\nChú ý có kiểm tra điều kiện của h: 2<=h<=10. Nếu\r\n"
				+ "h nằm ngoài đoạn trên, yêu cầu người dùng nhập lại. ");
		Label label1= new Label("Nhập h: ");
		TextField text= new TextField();
		text.setMaxWidth(50);
		Label label2= new Label("Tam giác có chiều cao h được in ra là: ");
		TextArea result=new TextArea();
		result.setEditable(false);
		result.setMaxWidth(200);
		text.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				result.setText("");
				int h=Integer.parseInt(text.getText());
				if(h>10||h<2) {
					text.setText("");
					Alert alert=new Alert(Alert.AlertType.INFORMATION);
					alert.setTitle("Information");
					alert.setHeaderText("Lỗi khi nhập chiều cao h");
					alert.setContentText("Hãy nhập lại h sao cho 2<=h<=10 !!!");
					alert.show();
				}else {
					for(int i=1;i<=h;i++) {
				        for(int j=1;j<=i;j++) {
				    	    result.appendText("* ");
				    	}
				    	result.appendText("\n");
				    }
				}
				
			}
		});
	    VBox layout=new VBox();
		layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text,label2,result);
		scene = new Scene(layout,400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();
	}
}
