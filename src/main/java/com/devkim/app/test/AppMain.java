package com.devkim.app.test;
import com.devkim.app.departments.DepartmentDAO;
import com.devkim.app.departments.DepartmentDTO;
import com.devkim.app.employees.EmployeeDAO;
import com.devkim.app.employees.EmployeeDTO;
import com.devkim.app.regions.*;
import com.devkim.app.views.View;


public class AppMain {
	public static void main(String[] args) {
		try {
			View view = new View();
			DepartmentDAO departmentDAO = new DepartmentDAO();
			view.departmentView(departmentDAO.getList());
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDEPARTMENT_ID(100);
			departmentDTO = departmentDAO.getDetail(departmentDTO);
			if(departmentDTO!=null) {
				view.departmentView(departmentDTO);
			}
			
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
			EmployeeDAO employeeDAO = new EmployeeDAO();
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setEmployee_id(1);
			employeeDTO = employeeDAO.getDetail(employeeDTO);
			if(employeeDTO != null) {
				view.employeeView(employeeDTO);
			}
			view.employeeView(employeeDAO.getList());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
