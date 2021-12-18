package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class HienThiController{
    Stage stage;
    Scene scene;
    private Connection con=null;
    private PreparedStatement pst=null;
    private ResultSet rs=null;
    private ObservableList<HocSinh> list;
    @FXML
    private Hyperlink quayLai;

    @FXML
    private TableView<HocSinh> danhSach;

    @FXML
    private TableColumn<HocSinh, String> columnSoCanCuoc;

    @FXML
    private TableColumn<HocSinh, String> columnHoTen;

    @FXML
    private TableColumn<HocSinh, String> columnGioiTinh;

    @FXML
    private TableColumn<HocSinh, String> columnNgaySinh;
    
    @FXML
    private TableColumn<HocSinh, String> columnQueQuan;

    @FXML
    private TableColumn<HocSinh, String> columnLop;
    
    @FXML
    private TableColumn<HocSinh, String> columnTuoi;
    
    @FXML
    private TextField searchHoTen;

    @FXML
    private TextField searchGioiTinh;

    @FXML
    private TextField searchNgaySinh;

    @FXML
    private TextField searchQueQuan;

    @FXML
    private TextField searchLop;
    
    @FXML
    private TextField searchTuoi;

    @FXML
    private Button search;
    @FXML
    void quayLai(ActionEvent event) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("TrangChu.fxml"));
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
	public void run1() {
		search.setVisible(false);
		searchHoTen.setVisible(false);
		searchGioiTinh.setVisible(false);
		searchNgaySinh.setVisible(false);
		searchQueQuan.setVisible(false);
		searchLop.setVisible(false);
		searchTuoi.setVisible(false);
		try {
			con=ConnectSQL.getConnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		list=FXCollections.observableArrayList();
		setCellTable();
		loadDataFromDatabase();
	}
    private void setCellTable() {
    	columnSoCanCuoc.setCellValueFactory(new PropertyValueFactory<>("SoCanCuoc"));
    	columnHoTen.setCellValueFactory(new PropertyValueFactory<>("HoTen"));
    	columnGioiTinh.setCellValueFactory(new PropertyValueFactory<>("GioiTinh"));
    	columnNgaySinh.setCellValueFactory(new PropertyValueFactory<>("NgaySinh"));
    	columnQueQuan.setCellValueFactory(new PropertyValueFactory<>("QueQuan"));
    	columnLop.setCellValueFactory(new PropertyValueFactory<>("Lop"));
    	columnTuoi.setCellValueFactory(new PropertyValueFactory<>("Tuoi"));
    }
    private void loadDataFromDatabase() {
    	try {
			pst=con.prepareStatement("select * from HocSinh");
			rs=pst.executeQuery();
			while(rs.next()) {
				list.add(new HocSinh(rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	danhSach.setItems(list);
    }
    @FXML
    void search(ActionEvent event) throws SQLException {
    	String hoTen=searchHoTen.getText();
    	String gioiTinh=searchGioiTinh.getText();
    	String ngaySinh=searchNgaySinh.getText();
    	String queQuan=searchQueQuan.getText();
    	String lop=searchLop.getText();
    	String tuoi=searchTuoi.getText();
    	list.clear();
		String sql="select * from HocSinh where HoTen like ? and GioiTinh like ? and NgaySinh like ? and QueQuan like ? and Lop like ? and Tuoi like ?";
	    pst=con.prepareStatement(sql);
	    if(hoTen.equals("")) {
	    	pst.setString(1, "%");
	    }else pst.setString(1,hoTen);
	    if(gioiTinh.equals("")) {
	    	pst.setString(2, "%");
	    }else pst.setString(2, gioiTinh);
	    if(ngaySinh.equals("")) {
	    	pst.setString(3, "%");
	    }else pst.setString(3, ngaySinh);
	    if(queQuan.equals("")) {
	    	pst.setString(4, "%");
	    }else pst.setString(4, queQuan);
	    if(lop.equals("")) {
	    	pst.setString(5, "%");
	    }else pst.setString(5, lop+"%");
	    if(tuoi.equals("")) {
	    	pst.setString(6, "%");
	    }else pst.setString(6, tuoi);
	    rs=pst.executeQuery();
	    while(rs.next()) {
	    	list.add(new HocSinh(rs.getString(1),rs.getString(2),rs.getString(3),
					rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
	    }
	    danhSach.setItems(list);
    }
    public void run2() throws SQLException {
    	search.setVisible(true);
    	searchHoTen.setVisible(true);
		searchGioiTinh.setVisible(true);
		searchNgaySinh.setVisible(true);
		searchQueQuan.setVisible(true);
		searchLop.setVisible(true);
		searchTuoi.setVisible(true);
		try {
			con=ConnectSQL.getConnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		list=FXCollections.observableArrayList();
		setCellTable();
		loadDataFromDatabase();
    }
}
