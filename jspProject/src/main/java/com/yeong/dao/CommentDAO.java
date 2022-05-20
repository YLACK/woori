package com.yeong.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yeong.dto.CommentDTO;

import db.DBConnection;

public class CommentDAO {
	public List<CommentDTO> commList(int b_no) {
		List<CommentDTO> list = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM may_comment WHERE b_no=?";

		try {
			con = DBConnection.dbConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, b_no);
			rs = pstmt.executeQuery();
			list = new ArrayList<>();

			while (rs.next()) {
				CommentDTO dto = new CommentDTO();
				dto.setC_no(rs.getInt("c_no"));
				dto.setB_no(rs.getInt("b_no"));
				dto.setC_like(rs.getInt("c_like"));
				dto.setC_comment(rs.getString("c_comment"));
				dto.setM_no(rs.getInt("m_no"));
				dto.setC_date(rs.getString("c_date"));

				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return list;
	}
}
