package com.mycompany.drugsfound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class DrugsfoundApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DrugsfoundApplication.class, args);
		org.springframework.context.ApplicationContext context = SpringApplication.run(DrugsfoundApplication.class, args);

		DataSource ds = context.getBean(DataSource.class);
		Connection con = null;

		try {

			con = ds.getConnection();
			System.out.println("success");
			ResultSet rs = con.createStatement().executeQuery("select *from personnel");
			while(rs.next()) {
				System.out.println(rs.getString("nom_personnel"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {

			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
