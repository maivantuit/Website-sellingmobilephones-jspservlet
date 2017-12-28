/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DanhMucDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelclasses.DanhMuc;

/**
 *
 * @author CỌP
 */
public class QuanLyDanhMucServlet extends HttpServlet {

    DanhMucDAO danhmucdao = new DanhMucDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String command = request.getParameter("command");
        String url = "";
        String error = "";
        // dữ liệu: (khi thêm 1 danh mục khác nhà sản xuất thì phải thêm nhà sản xuất)        
        String madanhmucsp = request.getParameter("MaDMSPurl"); // lay tu thanh url khi click sua hay xoa tai manager_danhmuc
        try {
            switch (command) {
                case "deleteurl":
                    danhmucdao.DeleteDanhMuc(madanhmucsp);
                    url = "/admin/manager_danhmuc.jsp";
                    break;
            }
        } catch (Exception e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String command = request.getParameter("command");
        String url = "";
        String error = "";
        // dữ liệu: (khi thêm 1 danh mục khác nhà sản xuất thì phải thêm nhà sản xuất)
        String tendm = request.getParameter("tendanhmuc");
        String mansx = request.getParameter("manhasanxuat");
        // kiểm tra text field rỗng:
        if (tendm.equals("")) {
            error = "Vui lòng nhập tên danh mục!";
            request.setAttribute("error", error);
        }
        try {
            if (error.length() == 0) {
                switch (command) {
                    case "themdanhmucmoi":
                        danhmucdao.InsertDanhMuc(new DanhMuc(tendm, mansx));
                        url = "/admin/manager_danhmuc.jsp";
                        break;
                    case "updateurl":
                        String tendmup = request.getParameter("tendanhmuc");
                        String mansxup = request.getParameter("manhasanxuat");
                        danhmucdao.UpdateDanhMuc(new DanhMuc(request.getParameter("MaDMSPurl"), tendmup, mansxup));
                        url = "/admin/manager_danhmuc.jsp";
                        break;
                }
            } else {
                url = "/admin/insert_danhmuc.jsp";
            }
        } catch (Exception e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);

    }

}
