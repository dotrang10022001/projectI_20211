package tuan5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GiaoDien extends Application {
	Stage stage;
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button1=new Button("Bài 1");
		button1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai1_tuan23());
				stage.show();
			}
		});
		Button button2=new Button("Bài 2");
		button2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai2_tuan23());
				stage.show();
			}
		});
		Button button3=new Button("Bài 3");
		button3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai3_tuan23());
				stage.show();
			}
		});
		Button button4=new Button("Bài 4");
		button4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai4_tuan23());
				stage.show();
			}
		});
		Button button5=new Button("Bài 5");
		button5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai5_tuan23());
				stage.show();
			}
		});
		Button button6=new Button("Bài 6");
		button6.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai6_tuan23());
				stage.show();
			}
		});
		Button button7=new Button("Bài 7");
		button7.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai7_tuan23());
				stage.show();
			}
		});
		Button button8=new Button("Bài 8");
		button8.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai8_tuan23());
				stage.show();
			}
		});
		Button button9=new Button("Bài 9");
		button9.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai9_tuan23());
				stage.show();
			}
		});
		Button button10=new Button("Bài 10");
		button10.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai10_tuan23());
				stage.show();
			}
		});
		Button button11=new Button("Bài 11");
		button11.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai11_tuan23());
				stage.show();
			}
		});
		Button button12=new Button("Bài 12");
		button12.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai12_tuan23());
				stage.show();
			}
		});
		Button button_1=new Button("Bài 1 thủ tục");
		button_1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai1_ham_thutuc_tuan23());
				stage.show();
			}
		});
		Button button_2=new Button("Bài 2 thủ tục");
		button_2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai2_ham_thutuc_tuan23());
				stage.show();
			}
		});
		Button button_3=new Button("Bài 3 thủ tục");
		button_3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai3_ham_thutuc_tuan23());
				stage.show();
			}
		});
		Button button_4=new Button("Bài 4 thủ tục");
		button_4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage=new Stage();
				stage.setTitle("Đỗ Thị Thùy Trang-20194188-709155");
				stage.setScene(new Bai4_ham_thutuc_tuan23());
				stage.show();
			}
		});
		VBox layout=new VBox();
		layout.getChildren().addAll(button1, button2, button3, button4, button5, button6, button7, button8,
				button9, button10, button11, button12, button_1, button_2, button_3, button_4);
		Scene scene=new Scene(layout, 600,400);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188-709155");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
    public static void main(String[] args) {
		launch(args);
	}
    
}
