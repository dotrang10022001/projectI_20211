package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class ThongKeController implements Initializable{
    private Connection con=null;
    private PreparedStatement pst1,pst2=null;
    private ResultSet rs1,rs2=null;

    @FXML
    private BarChart<String, Number> barchart;
    
    @FXML
    private CategoryAxis doTuoi;

    @FXML
    private NumberAxis soLuong;
   
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			con=ConnectSQL.getConnect();
			XYChart.Series<String,Number> series=new XYChart.Series<>();
			series.setName("2021");
			String sql1="select distinct Tuoi from HocSinh";
			pst1=con.prepareStatement(sql1);
			rs1=pst1.executeQuery();
			while(rs1.next()) {
				String sql2="select  count(SoCanCuoc)\r\n"
						+ "from HocSinh\r\n"
						+ "where Tuoi=?";
				pst2=con.prepareStatement(sql2);
				pst2.setString(1,rs1.getString(1));
				rs2=pst2.executeQuery();
				while(rs2.next()) {
					series.getData().add(new XYChart.Data<>(rs1.getString(1),rs2.getInt(1)));
				}
			}
			barchart.getData().add(series);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
