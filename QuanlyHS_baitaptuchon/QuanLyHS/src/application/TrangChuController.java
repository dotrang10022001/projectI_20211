package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
public class TrangChuController implements Initializable{
    private Stage stage;
    private Scene scene;
    private Connection con=null;
    private PreparedStatement pst=null;
    private ResultSet rs=null;
    @FXML
    private Hyperlink thoat;

    @FXML
    private TextField textHoTen;

    @FXML
    private TextField textQueQuan;

    @FXML
    private TextField textLop;
    
    @FXML
    private TextField textTuoi;

    @FXML
    private Button buttonThem;

    @FXML
    private Button buttonXoa;

    @FXML
    private Button buttonSua;

    @FXML
    private Button buttonTimKiem;

    @FXML
    private Button buttonThongKe;

    @FXML
    private Button buttonHienThi;
    
    @FXML
    private Button buttonReset;

    @FXML
    private TextField textSoCanCuoc;

    @FXML
    private DatePicker textNgaySinh;

    @FXML
    private RadioButton buttonNam;

    @FXML
    private ToggleGroup food;

    @FXML
    private RadioButton buttonNu;

    @FXML
    void reset(ActionEvent event) {
    	textSoCanCuoc.setText("");
    	textHoTen.setText("");
    	textNgaySinh.setValue(null);
    	textQueQuan.setText("");
    	textLop.setText("");
    	textTuoi.setText("");
    	buttonNam.setSelected(false);
    	buttonNu.setSelected(false);
    }
    @FXML
    void hienThi(ActionEvent event) {
    	try {
    		FXMLLoader loader=new FXMLLoader();
			loader.setLocation(getClass().getResource("HienThi.fxml"));
			Parent root=loader.load();
			scene = new Scene(root);
			HienThiController ht=loader.getController();
			ht.run1();
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		stage.setTitle("Quản lý học sinh");
    		stage.setScene(scene);
    		stage.centerOnScreen();
    		stage.show();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    String soCanCuoc,hoTen,gioiTinh,ngaySinh,queQuan,lop,tuoi;
    Alert alert=new Alert(Alert.AlertType.INFORMATION);
	boolean checkThongTinNhap() {
		boolean check;
		alert.setHeaderText("Thông báo");
		if(textSoCanCuoc.getText().equals("")||textHoTen.getText().equals("")||(!buttonNam.isSelected()&&
				!buttonNu.isSelected())||
    			textQueQuan.getText().equals("")||textLop.getText().equals("")||textTuoi.getText().equals("")) {
			check=true;
			alert.setContentText("Hãy nhập đầy đủ thông tin học sinh!!!");
			alert.show();
    	}else check=false;
		return check;
	}
	
    void init() {
    	soCanCuoc=textSoCanCuoc.getText();
	    hoTen=textHoTen.getText();
	    if(buttonNam.isSelected()) gioiTinh="Nam";
	    if(buttonNu.isSelected()) gioiTinh="Nữ";
	    ngaySinh=textNgaySinh.getValue().toString();
	    queQuan=textQueQuan.getText();
	    lop=textLop.getText();
	    tuoi=textTuoi.getText();
    }
    @FXML
    void sua(ActionEvent event) throws SQLException, IOException {
		if(!checkThongTinNhap())
		{
    		try {
        	    String sql="update HocSinh set HoTen=?,GioiTinh=?,NgaySinh=?,QueQuan=?,Lop=?,Tuoi=? where SoCanCuoc=?";
        	    init();
        		pst=con.prepareStatement(sql);
        		pst.setString(1, hoTen);
        		pst.setString(2, gioiTinh);
        		pst.setString(3, ngaySinh);
        		pst.setString(4, queQuan);
        		pst.setString(5, lop);
        		pst.setString(6, tuoi);
        		pst.setString(7, soCanCuoc);
        		int i=pst.executeUpdate();
        		if(i==1) {
        			alert.setContentText("Sửa thông tin học sinh thành công");
        			alert.show();
        		}
        	}catch(SQLException e) {
        		alert.setContentText("Kiểm tra lại thông tin đã nhập!!!");
        	    alert.show();
        	}
        	finally {
        		pst.close();
        	}
    	}
    }

    @FXML
    void them(ActionEvent event) throws SQLException {
    	if(!checkThongTinNhap())
	    {
    		try {
        	    String sql="insert into HocSinh values(?,?,?,?,?,?,?)";
        	    init();
        		pst=con.prepareStatement(sql);
        		pst.setString(1, soCanCuoc);
        		pst.setString(2, hoTen);
        		pst.setString(3, gioiTinh);
        		pst.setString(4, ngaySinh);
        		pst.setString(5, queQuan);
        		pst.setString(6, lop);
        		pst.setString(7, tuoi);
        		int i=pst.executeUpdate();
        		if(i==1) {
        			alert.setContentText("Thêm học sinh thành công");
        			alert.show();
        		}
        	}catch(SQLException e) {
        		alert.setContentText("Kiểm tra lại thông tin đã nhập!!!");
        	    alert.show();
        	}
        	finally {
        		pst.close();
        	}
    	}
    }

    @FXML
    void thoatDangNhap(ActionEvent event) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("DangNhap.fxml"));
    		scene = new Scene(root);
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		stage.setTitle("Quản lý học sinh");
    		stage.setScene(scene);
    		stage.centerOnScreen();
    		stage.show();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    @FXML
    void thongKe(ActionEvent event) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("ThongKe.fxml"));
    		scene = new Scene(root);
    		stage=new Stage();
    		stage.setTitle("Quản lý học sinh");
    		stage.setScene(scene);
    		stage.centerOnScreen();
    		stage.show();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    @FXML
    void timKiem(ActionEvent event) throws IOException {
    	try {
    		if(textSoCanCuoc.getText().equals("")) {
    			FXMLLoader loader=new FXMLLoader();
    			loader.setLocation(getClass().getResource("HienThi.fxml"));
    			Parent root=loader.load();
    			scene = new Scene(root);
    			HienThiController ht=loader.getController();
    			ht.run2();
    			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        		stage.setTitle("Quản lý học sinh");
        		stage.setScene(scene);
        		stage.centerOnScreen();
        		stage.show();
    		}else {
   			    String sql="select SoCanCuoc,HS.HoTen,GioiTinh,NgaySinh,QueQuan,Lop,GV.Hoten,Tuoi "
  					+ "from HocSinh HS, Lop L, GiaoVien GV "
   					+ "where HS.Lop=L.MaLop and L.MaGV=GV.MaGV and SoCanCuoc=? ";
    			String soCC=textSoCanCuoc.getText();
    			pst=con.prepareStatement(sql);
    			pst.setString(1,soCC);
    			rs=pst.executeQuery();
    			stage = new Stage();
    			FXMLLoader loader=new FXMLLoader();
    			loader.setLocation(getClass().getResource("KetQuaTimKiem.fxml"));
    			Parent root=loader.load();
    			scene = new Scene(root);
    			KQTimKiemController kq=loader.getController();
    			while(rs.next()) {
    				kq.ketQua(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
        					rs.getString(6),rs.getString(7),rs.getString(8));
    			}
        		stage.setTitle("Quản lý học sinh");
        		stage.setScene(scene);
        		stage.centerOnScreen();
        		stage.show();
    		}
    	}catch(SQLException e) {
   		    alert.setContentText("Kiểm tra lại thông tin đã nhập!");
    		alert.show();
    	}

    }

    @FXML
    void xoa(ActionEvent event) throws SQLException {
		if(textSoCanCuoc.getText().equals("")) {
			alert.setContentText("Nhập số căn cước để xóa");
			alert.show();
    	}
    	else {
    		Alert alert1=new Alert(Alert.AlertType.CONFIRMATION);
        	alert1.setHeaderText("Bạn chắc chắn muốn xóa?");
        	Optional<ButtonType> option=alert1.showAndWait();
        	if(option.get()==ButtonType.OK) {
            	try {
            		String soCanCuoc=textSoCanCuoc.getText();
            		String sql="delete from HocSinh where SoCanCuoc=?";
            		pst=con.prepareStatement(sql);
            		pst.setString(1, soCanCuoc);
            		int i=pst.executeUpdate();
            		if(i==1) {
            			alert.setContentText("Xóa thành công!!!");
            			alert.show();
            		}else {
            			alert.setContentText("Không tồn tại học sinh có số căn cước như đã nhập!!!");
            			alert.show();
            		}
            	}catch(Exception e) {
            		e.printStackTrace();
            	}
            	finally {
            		pst.close();
            	}
        	}
    	}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			con=ConnectSQL.getConnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
