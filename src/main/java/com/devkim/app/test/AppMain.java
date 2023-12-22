package com.devkim.app.test;
import com.devkim.app.departments.DepartmentDAO;
import com.devkim.app.regions.*;
import com.devkim.app.views.View;


public class AppMain {
	public static void main(String[] args) {
		try {
			View view = new View();
			DepartmentDAO departmentDAO = new DepartmentDAO();
			view.departmentView(departmentDAO.getList());
			RegionDAO regionDAO = new RegionDAO();
			view.regionView(regionDAO.getList());
			RegionDTO regionDTO = new RegionDTO();
			regionDTO.setREGION_ID(4);
			regionDTO = regionDAO.getDetail(regionDTO);
			if(regionDTO != null) {
				view.regionView(regionDTO);
			} else {
				System.out.println("없는 아이디 입니다.");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
