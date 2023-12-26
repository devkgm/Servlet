package com.devkim.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.devkim.app.util.DBConnector;

public class EmployeeDAO {
	public EmployeeDTO getDetail(EmployeeDTO dto) throws Exception{
		Connection con = DBConnector.getConnector();
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, dto.getEmployee_id());
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			dto.setFirst_name(rs.getString("FIRST_NAME"));
			dto.setLast_name(rs.getString("LAST_NAME"));
			dto.setEmail(rs.getString("EMAIL"));
			dto.setPhone_number(rs.getString("PHONE_NUMBER"));
			dto.setHire_date(rs.getDate("HIRE_DATE"));
			dto.setJob_id(rs.getString("JOB_ID"));
			dto.setSalary(rs.getDouble("SALARY"));
			dto.setCommission_pct(rs.getDouble("COMMISSION_PCT"));
			dto.setManager_id(rs.getInt("MANAGER_ID"));
			dto.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			return dto;
		} else {
			return null;
		}
	}
	
	
	
	public List<EmployeeDTO> getList() throws Exception {
		Connection con = DBConnector.getConnector();
		
		String sql = "SELECT * FROM EMPLOYEES";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		List<EmployeeDTO> list = new ArrayList<>();
		while(rs.next()) {
			EmployeeDTO dto = new EmployeeDTO();

			dto.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			dto.setFirst_name(rs.getString("FIRST_NAME"));
			dto.setLast_name(rs.getString("LAST_NAME"));
			dto.setEmail(rs.getString("EMAIL"));
			dto.setPhone_number(rs.getString("PHONE_NUMBER"));
			dto.setHire_date(rs.getDate("HIRE_DATE"));
			dto.setJob_id(rs.getString("JOB_ID"));
			dto.setSalary(rs.getDouble("SALARY"));
			dto.setCommission_pct(rs.getDouble("COMMISSION_PCT"));
			dto.setManager_id(rs.getInt("MANAGER_ID"));
			dto.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			
			list.add(dto);
		}
		DBConnector.disConnect(rs, ps, con);
		return list;
		
		
		
		
	}
}
