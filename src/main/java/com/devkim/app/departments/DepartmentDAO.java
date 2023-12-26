package com.devkim.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.devkim.app.util.DBConnector;

public class DepartmentDAO {
	public int update(DepartmentDTO dto) throws Exception{
		Connection con = DBConnector.getConnector();
		String sql = "UPDATE DEPARTMENTS SET DEPARTMENT_NAME=?, LOCATION_ID=? WHERE DEPARTMENT_ID = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(3, dto.getDEPARTMENT_ID());
		st.setString(1, dto.getDEPARTMENT_NAME());
		

		st.setInt(2, dto.getLOCATION_ID());
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		return result;
	}
	
	public int delete(DepartmentDTO dto) throws Exception{
		Connection con = DBConnector.getConnector();
		String sql = "DELETE FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, dto.getDEPARTMENT_ID());
		int result = st.executeUpdate();
		DBConnector.disConnect(st, con);
		return result;
	}
	
	public int add(DepartmentDTO dto) throws Exception{
		Connection con = DBConnector.getConnector();
		String sql = "INSERT INTO DEPARTMENTS VALUES (?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, dto.getDEPARTMENT_ID());
		st.setString(2, dto.getDEPARTMENT_NAME());
		st.setInt(3, dto.getMANAGER_ID());
		st.setInt(4, dto.getLOCATION_ID());
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		return result;
	}
	
	public List<DepartmentDTO> getList() throws Exception{
		List<DepartmentDTO> dtoList = new ArrayList<DepartmentDTO>();
		Connection connection = DBConnector.getConnector();
		String sql = "SELECT * FROM DEPARTMENTS";
		PreparedStatement st = connection.prepareStatement(sql);
		st.executeQuery();
		ResultSet resultSet = st.getResultSet();

		while(resultSet.next()) {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			int DepartmentId = resultSet.getInt("DEPARTMENT_ID");
			String DepartmentName = resultSet.getString("DEPARTMENT_NAME");
			int ManagerId = resultSet.getInt("MANAGER_ID");
			int LocationId = resultSet.getInt("LOCATION_ID");
			departmentDTO.setDEPARTMENT_ID(DepartmentId);
			departmentDTO.setDEPARTMENT_NAME(DepartmentName);
			departmentDTO.setMANAGER_ID(ManagerId);
			departmentDTO.setLOCATION_ID(LocationId);
			dtoList.add(departmentDTO);
		}
		
		DBConnector.disConnect(resultSet, st, connection);
		return dtoList;
	}
	public DepartmentDTO getDetail(DepartmentDTO dto) throws Exception{
		DepartmentDTO departmentDTO = null;
		Connection connection= DBConnector.getConnector();
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
		PreparedStatement st = connection.prepareStatement(sql);
		st.setInt(1, dto.getDEPARTMENT_ID());
		ResultSet resultSet = st.executeQuery();
		
		if(resultSet.next()) {
			departmentDTO = new DepartmentDTO();
			int DepartmentId = resultSet.getInt("DEPARTMENT_ID");
			String DepartmentName = resultSet.getString("DEPARTMENT_NAME");
			int ManagerId = resultSet.getInt("MANAGER_ID");
			int LocationId = resultSet.getInt("LOCATION_ID");
			departmentDTO.setDEPARTMENT_ID(DepartmentId);
			departmentDTO.setDEPARTMENT_NAME(DepartmentName);
			departmentDTO.setMANAGER_ID(ManagerId);
			departmentDTO.setLOCATION_ID(LocationId);
		}
		DBConnector.disConnect(resultSet, st, connection);
		return departmentDTO;
	}
}
