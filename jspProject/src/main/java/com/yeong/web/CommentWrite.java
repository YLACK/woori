package com.yeong.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yeong.dao.BoardDAO;
import com.yeong.dto.CommentDTO;
import com.yeong.util.Util;

@WebServlet("/commentWrite")
public class CommentWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CommentWrite() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		if (session.getAttribute("m_id") != null) {
			if (request.getParameter("b_no") != null && Util.str2Int(request.getParameter("b_no"))) {
				CommentDTO dto = new CommentDTO();
				dto.setB_no(Integer.parseInt(request.getParameter("b_no")));
				dto.setC_comment(Util.HTML2str(request.getParameter("comment")));
				dto.setM_id((String) session.getAttribute("m_id"));

				BoardDAO dao = new BoardDAO();
				dao.commentwirte(dto);
				response.sendRedirect("./detail?b_no=" + dto.getB_no());
			} else {
				// 숫자가 없거나 변환이 안 됨
			}
		} else {
			// 로그인 하지 않음

		}

	}
}
