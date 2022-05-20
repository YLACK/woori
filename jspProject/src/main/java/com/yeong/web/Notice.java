package com.yeong.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yeong.dao.NoticeDAO;
import com.yeong.dto.NoticeDTO;


@WebServlet("/notice")
public class Notice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Notice() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeDAO dao = new NoticeDAO();
		List<NoticeDTO> noticeList = dao.noticeList();
		System.out.println(noticeList);
		RequestDispatcher rd = request.getRequestDispatcher("./notice.jsp");
		request.setAttribute("list", noticeList);//${list } 실제 데이터 
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
