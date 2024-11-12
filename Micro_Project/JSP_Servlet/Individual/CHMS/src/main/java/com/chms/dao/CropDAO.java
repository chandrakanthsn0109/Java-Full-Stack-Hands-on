package com.chms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.chms.bean.Crop;
import com.chms.util.DBUtil;

public class CropDAO {
	
	public int insertCrop(Crop crop) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into crop values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, crop.getCid());
			ps.setString(2, crop.getCname());
			ps.setInt(3, crop.getCultPeriod());
			ps.setInt(4, crop.getHarCap());
			n = ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int deleteCrop(int cid) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from crop where cid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cid);
			n = ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int updateCrop(Crop crop) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update crop set cname = ?, cultper = ?, harcap = ? where cid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, crop.getCname());
			ps.setInt(2, crop.getCultPeriod());
			ps.setInt(3, crop.getHarCap());
			ps.setInt(4, crop.getCid());
			n = ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public Crop findCrop(int cid) {
		Crop crop = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from crop where cid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cid);
			ResultSet res = ps.executeQuery();
			if(res.next()) {
				crop = new Crop();
				crop.setCid(res.getInt("cid"));
				crop.setCname(res.getString("cname"));
				crop.setCultPeriod(res.getInt("cultper"));
				crop.setHarCap(res.getInt("harcap"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return crop;
	}
	
	public List<Crop> findAllCrop() {
		List<Crop> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from crop";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				Crop crp = new Crop();
				crp.setCid(res.getInt("cid"));
				crp.setCname(res.getString("cname"));
				crp.setCultPeriod(res.getInt("cultper"));
				crp.setHarCap(res.getInt("harcap"));
				
				list.add(crp);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
