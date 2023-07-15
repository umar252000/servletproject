package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.Product;
import util.ConnectionUtil;

public class ProductDao {
	public void save(Product product) {
		Connection connection = ConnectionUtil.getConnection();
		try {
			PreparedStatement statement =connection
					.prepareStatement("insert into product(name,description,price) values(?,?,?)");
			statement.setString(1,product.getName());
			statement.setString(2,product.getDescription());
			statement.setBigDecimal(3,product.getPrice());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}}