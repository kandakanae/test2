package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Product;

public class ProductDAO extends DAO {

	/**
	 * Product表からキーワードを検索し、該当する商品のListを返却する。
	 * @param keyword
	 * @return list<Product>
	 * @throws Exception
	 */
	public List<Product> search(String keyword) throws Exception {
		// ここから
		List<Product> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
				"select * from product where name like ?");
		st.setString(1, "%"+keyword+"%");
		ResultSet rs = st.executeQuery();

		while(rs.next()) {
			Product p=new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setPrice(rs.getInt("price"));
			list.add(p);
		}

		st.close();
		con.close();

		return list;
		// ここまで
	}

	/**
	 * Product表へデータを挿入する。
	 * @param product
	 * @return
	 * @throws Exception
	 */
	public int insert(Product product) throws Exception {
		// ここから
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
				"insert into product values(null, ?, ?)");
		st.setString(1, product.getName());
		st.setInt(2, product.getPrice());
		int line=st.executeUpdate();

		st.close();
		con.close();

		// ここまで
		return line;
	}
}
