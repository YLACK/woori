package com.yeong.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yeong.dao.BoardDAO;
import com.yeong.dto.BoardDTO;
import com.yeong.util.Util;


@WebServlet("/like")
public class Like extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Like() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//b_no가 오는지 검사
		if(request.getParameter("b_no")!=null
					&& Util.str2Int(request.getParameter("b_no"))) {
		int b_no = Integer.parseInt(request.getParameter("b_no"));
		//데이터베이스 접속 b_like +1시키기
		BoardDAO dao = new BoardDAO();
		dao.like(b_no);//여기 만들어주세요.
		// ./detail?b_no= 글번호로 이동시키기
		BoardDTO dto = new BoardDTO();
		dto = dao.detail(b_no);
		response.getWriter().print(dto.getB_like());
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}


