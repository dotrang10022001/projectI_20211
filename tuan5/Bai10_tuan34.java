package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai10_tuan34 extends Application{
	int N;
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 10: Cho một dãy số nguyên bất kỳ, "
				+ "\nhãy tìm ra 1 một dãy số liền nhau dài nhất bao gồm các số bằng nhau. "
				+ "\nHãy in ra số lượng và các chỉ số đầu tiên của dãy con này.");
		Label label1= new Label("Nhập số tự nhiên N(>=1): ");
		TextField text1= new TextField();text1.setMaxWidth(50);
		Label label2= new Label("Nhập vào N số nguyên: ");
		TextField text2=new TextField();text2.setMaxWidth(200);
		Label label3= new Label("Dãy liền nhau dài nhất gồm các số bằng nhau là: ");
		TextArea text3=new TextArea();text3.setEditable(false);text3.setMaxWidth(200);text3.setMaxHeight(100);
	    Label label4= new Label("Số lượng các số của dãy con này là: ");
		TextField text4=new TextField();text4.setEditable(false);text4.setMaxWidth(50);
	    Label label5= new Label("Chỉ số đầu tiên của dãy là: ");
		TextArea text5=new TextArea();text5.setEditable(false);text5.setMaxWidth(200);text5.setMaxHeight(100);
	    text1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {N=Integer.parseInt(text1.getText());}
		});
		text2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				text3.setText("");
				text5.setText("");
				String str=text2.getText();
				String[] s=str.split(" ");
				int A[]=new int[N],B[]=new int[2*N],j=0,length=1;
				for(int i=0;i<N;i++) A[i]=Integer.parseInt(s[i]);
				B[j]=0;
				for(int i=1;i<N;i++) 
				    if(A[i]==A[i-1]) length++;
				    else {B[j+N]=length;B[++j]=i;length=1;}
				B[j+N]=length;
				int max=B[N];
				for(int i=N+1;i<2*N;i++) if(B[i]>max)max=B[i];
				for(int i=N;i<2*N;i++)
				if(B[i]==max) {
					for(int k=B[i-N];k<B[i-N]+B[i];k++) {
						text3.appendText(Integer.toString(A[k])+" ");
					}
					text3.appendText("\n");
					text5.appendText(Integer.toString(B[i-N])+"\n");
				}
				text4.setText(Integer.toString(max));
			}
		});
	    VBox layout=new VBox();
		layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text1,label2,text2,label3,text3,
				label4,text4,label5,text5);
		Scene scene = new Scene(layout,500,600);
		primaryStage.setScene(scene);
		primaryStage.centerOnScreen();
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();}}
