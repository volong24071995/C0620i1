package com.codegym.controller;

import com.codegym.dao.ManagementMissWorldImpl;
import com.codegym.dao.TinhthanhImpl;
import com.codegym.model.MissWorld;
import com.codegym.model.Tinhthanh;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MissWorldServlet",urlPatterns = "/missWorlds")
public class MissWorldServlet extends HttpServlet {
    private ManagementMissWorldImpl managementMissWorld = new ManagementMissWorldImpl();
    private TinhthanhImpl tinhthanh=new TinhthanhImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createMissWorld(request, response);
                break;
            case "edit":
                updateMissWold(request, response);
                break;
            case "delete":
                deleteMisWorld(request, response);
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                showDeleteForm(request, response);
                break;
            case "view":
                viewMissWorld(request, response);
                break;
            case "duyet":
                statusMissWorld(request, response);
                break;
            case "listYes":
                showListStatusYes(request,response);
                break;
            default:
                listMissWorlds(request, response);
                break;
        }
    }

    private void statusMissWorld(HttpServletRequest request, HttpServletResponse response){
        String id=request.getParameter("id");
        MissWorld missWorld=this.managementMissWorld.findById(id);
        RequestDispatcher dispatcher;
        if(missWorld == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            if (missWorld.getStatus().equals("Yes")){
                missWorld.setStatus("No");

            }else {
                missWorld.setStatus("Yes");
            }
            try {
                response.sendRedirect("/missWorlds");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showListStatusYes(HttpServletRequest request, HttpServletResponse response){
        List<MissWorld> listStatusYes=new ArrayList<>();
        List<MissWorld> list=managementMissWorld.findAll();
        for (MissWorld missWorld: list) {
            if(missWorld.getStatus().equals("Yes")){
                listStatusYes.add(missWorld);
            }
        }
        request.setAttribute("missList", listStatusYes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/listStatusYes.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void viewMissWorld(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        MissWorld missWorld = this.managementMissWorld.findById(id);
        RequestDispatcher dispatcher;
        if(missWorld == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("missWorld", missWorld);
            dispatcher = request.getRequestDispatcher("/view.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteMisWorld(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        MissWorld missWorld = this.managementMissWorld.findById(id);
        RequestDispatcher dispatcher;
        if(missWorld == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            if (missWorld.getStatus().equals("No")){
                this.managementMissWorld.remove(id);
                try {
                    response.sendRedirect("/missWorlds");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else {
                request.setAttribute("missWorld", missWorld);
                request.setAttribute("message", "<script>\n" +
                        "        alert(\"No delete\")\n" +
                        "    </script>");
                dispatcher = request.getRequestDispatcher("/view.jsp");
                try {
                    dispatcher.forward(request, response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        MissWorld missWorld = this.managementMissWorld.findById(id);
        RequestDispatcher dispatcher;
        if(missWorld == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("missWorld", missWorld);
            dispatcher = request.getRequestDispatcher("/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateMissWold(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String birthday = request.getParameter("birthday");
        String phone = request.getParameter("phone");
        String cmnd = request.getParameter("cmnd");
        String job = request.getParameter("job");
        String vanhoa=request.getParameter("vanhoa");
        String dantoc=request.getParameter("dantoc");
        String donvicongtac=request.getParameter("donvicongtac");
        float cannang=Float.parseFloat(request.getParameter("cannang"));
        float chieucao=Float.parseFloat(request.getParameter("chieucao"));
        String nangkhieu=request.getParameter("nangkhieu");
        String img=request.getParameter("img");
        String tinh=request.getParameter("tinh");

        MissWorld missWorld = this.managementMissWorld.findById(id);
        RequestDispatcher dispatcher;
        if(missWorld == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            missWorld.setName(name);
            missWorld.setEmail(email);
            missWorld.setAddress(address);
            missWorld.setDob(birthday);
            missWorld.setIdentityCard(cmnd);
            missWorld.setJob(job);
            missWorld.setEducationalLevel(vanhoa);
            missWorld.setNation(dantoc);
            missWorld.setWorkUnit(donvicongtac);
            missWorld.setWeight(cannang);
            missWorld.setHeight(chieucao);
            missWorld.setGifted(nangkhieu);
            missWorld.setImage(img);
            missWorld.setTinh(tinh);
            this.managementMissWorld.update(id, missWorld);
            request.setAttribute("missWorld", missWorld);
            request.setAttribute("message", "<script>\n" +
                    "        alert(\"MissWorld information was updated\")\n" +
                    "    </script>");
            dispatcher = request.getRequestDispatcher("/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        MissWorld missWorld = this.managementMissWorld.findById(id);
        RequestDispatcher dispatcher;
        List<Tinhthanh> myList=tinhthanh.findAll();
        if(missWorld == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("missWorld", missWorld);
            request.setAttribute("myList", myList);
            dispatcher = request.getRequestDispatcher("/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createMissWorld(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String birthday = request.getParameter("birthday");
        String phone = request.getParameter("phone");
        String cmnd = request.getParameter("cmnd");
        String job = request.getParameter("job");
        String vanhoa=request.getParameter("vanhoa");
        String dantoc=request.getParameter("dantoc");
        String donvicongtac=request.getParameter("donvicongtac");
        float cannang=Float.parseFloat(request.getParameter("cannang"));
        float chieucao=Float.parseFloat(request.getParameter("chieucao"));
        String nangkhieu=request.getParameter("nangkhieu");
        String img=request.getParameter("img");
        String tinh=request.getParameter("tinh");
        MissWorld missWorld = new MissWorld(name,birthday,address,phone,email,cmnd,job,vanhoa,dantoc,donvicongtac,chieucao,cannang,nangkhieu,img,tinh);
        try {
            if (!managementMissWorld.check(cmnd,email)){
                this.managementMissWorld.save(missWorld);
                request.setAttribute("message", "New missWorld was created");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/create.jsp");
                dispatcher.forward(request, response);
            }else {
                request.setAttribute("message", "<script>\n" +
                        "        alert(\"No create\")\n" +
                        "    </script>");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/create.jsp");
                dispatcher.forward(request, response);
            }
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<Tinhthanh> myList=tinhthanh.findAll();
        RequestDispatcher dispatcher = request.getRequestDispatcher("/create.jsp");
        request.setAttribute("myList",myList);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listMissWorlds(HttpServletRequest request, HttpServletResponse response) {
        List<MissWorld> list = this.managementMissWorld.findAll();
        request.setAttribute("missList", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}