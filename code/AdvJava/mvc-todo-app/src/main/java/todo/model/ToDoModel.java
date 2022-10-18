package todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import todo.bean.TaskBean;

public class ToDoModel {

	public boolean save(TaskBean bean) {
		boolean result = false;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd6july","root","root");
			PreparedStatement stmt = con.prepareStatement("insert into task(title,status, scheduledOn) values(?,?,?)");
			stmt.setString(1, bean.getTitle());
			stmt.setString(2, bean.getStatus());
			stmt.setString(3, bean.getScheduledOn());
			int count = stmt.executeUpdate();
			result = count>0;
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		 
		return result;
	}

	public List<TaskBean> getAll() {
		ArrayList<TaskBean> list = new ArrayList<TaskBean>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd6july","root","root");
			PreparedStatement stmt = con.prepareStatement("select * from task");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				TaskBean bean = new TaskBean();
					bean.setId(rs.getInt("id"));
					bean.setTitle(rs.getString("title"));
					bean.setStatus(rs.getString("status"));
					bean.setScheduledOn(rs.getString("scheduledOn"));
					bean.setUpdatedOn(rs.getString("updatedOn"));
				list.add(bean);
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public TaskBean getTaskById(int id) {
		TaskBean bean = new TaskBean();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd6july","root","root");
			PreparedStatement stmt = con.prepareStatement("select * from task where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				bean.setId(rs.getInt("id"));
				bean.setTitle(rs.getString("title"));
				bean.setStatus(rs.getString("status"));
				bean.setScheduledOn(rs.getString("scheduledOn"));
				bean.setUpdatedOn(rs.getString("updatedOn"));
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}
	
}
