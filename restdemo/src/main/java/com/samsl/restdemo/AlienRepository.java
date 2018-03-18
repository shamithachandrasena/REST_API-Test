package com.samsl.restdemo;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	List<Alien> aliens;
	
	java.sql.Connection con=null;
	
		public AlienRepository() {
			String url="jdbc:mysql://localhost:3306/restdemo";
			String username="root";
			String password="";
			try {
				 Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection(url,username,password); 
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
//		aliens=new ArrayList<>();
//		
//		Alien a=new Alien();
//		a.setId(101);
//		a.setName("Navin");
//		a.setPoints(55);
//		
//		Alien b=new Alien();
//		b.setId(102);
//		b.setName("Ravi");
//		b.setPoints(15);
//		
//		aliens.add(a);
//		aliens.add(b);
			
			
	}
	
	public List<Alien> getAliens() {
		aliens=new ArrayList<>();
		String sql="SELECT * FROM restdemo.alien";
		
		try {
		java.sql.Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			Alien alien=new Alien();
			alien.setId(rs.getInt(1));
			alien.setName(rs.getString(2));
			alien.setPoints(rs.getInt(3));
			aliens.add(alien);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return aliens;
		
	}
	
	public Alien getAlien(int id) {
		aliens=new ArrayList<>();
		String sql="SELECT * FROM restdemo.alien where id="+id;
		Alien alien=new Alien();
		try {
			java.sql.Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				
				alien.setId(rs.getInt(1));
				alien.setName(rs.getString(2));
				alien.setPoints(rs.getInt(3));
		
			}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		return alien;
		}
		
	public void createAlien(Alien alien) {
		// TODO Auto-generated method stub
//		aliens.add(alien);
		String sql="insert into alien values(?,?,?)";
		
		try {
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, alien.getId());
			st.setString(2, alien.getName());
			st.setInt(3, alien.getPoints()); 
			st.executeUpdate();
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}

	public void updateAlien(Alien alien) {
		// TODO Auto-generated method stub
		String sql="UPDATE `restdemo`.`alien` SET `name`=?, `points`=? WHERE `id`=?;";
		
		try {
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, alien.getName());
			st.setInt(2, alien.getPoints()); 
			st.setInt(3, alien.getId());
			st.executeUpdate();
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
		
		
	}
	
}
