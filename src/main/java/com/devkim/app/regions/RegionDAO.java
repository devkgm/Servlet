package com.devkim.app.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.devkim.app.util.DBConnector;

public class RegionDAO {
	public List<RegionDTO> getList() throws Exception{
//		db접속 후 부서 테입블의 모든 정보를 출력

	
		List<RegionDTO> dtoList = new ArrayList<RegionDTO>();
		Connection connection = DBConnector.getConnector();
		String sql = "SELECT * FROM REGIONS";
		PreparedStatement st = connection.prepareStatement(sql);
		st.executeQuery();
		ResultSet resultSet = st.getResultSet();
		
		while(resultSet.next()) {
			RegionDTO regionDTO = new RegionDTO();
			int RegionId = resultSet.getInt("REGION_ID");
			String RegionName = resultSet.getString("REGION_NAME");
			
			regionDTO.setREGION_ID(RegionId);
			regionDTO.setREGION_NAME(RegionName);
			
			dtoList.add(regionDTO);
		}
		
		DBConnector.disConnect(resultSet, st, connection);
		return dtoList;
		
		
	}
	public RegionDTO getDetail(RegionDTO regionDTO) throws Exception {
		RegionDTO dto = null;
		Connection connection = DBConnector.getConnector();
		String sql = "SELECT * FROM REGIONS WHERE REGION_ID = ?";
		PreparedStatement st = connection.prepareStatement(sql);
		st.setInt(1, regionDTO.getREGION_ID());
		
		ResultSet resultSet = st.executeQuery();
		
		if(resultSet.next()) {
			dto = new RegionDTO();
			dto.setREGION_ID(resultSet.getInt("REGION_ID"));
			dto.setREGION_NAME(resultSet.getString("REGION_NAME"));
		}
		DBConnector.disConnect(resultSet, st, connection);
		return dto;
		
	}

	
}
