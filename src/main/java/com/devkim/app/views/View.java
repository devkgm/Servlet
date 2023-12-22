package com.devkim.app.views;

import java.util.List;

import com.devkim.app.departments.DepartmentDTO;
import com.devkim.app.regions.RegionDTO;


public class View {
	public void departmentView(List<DepartmentDTO> dtoList) {
			System.out.println("부서 테이블");
			for(DepartmentDTO dto: dtoList) {
				System.out.printf("아이디:%3d 부서명:%-20s 메니저id:%3d 위치id:%4d\n", dto.getDEPARTMENT_ID(), dto.getDEPARTMENT_NAME(), dto.getMANAGER_ID(),dto.getLOCATION_ID());
				
			}
			System.out.println("==========");
	}
	public void departmentView(DepartmentDTO dto) {
		System.out.println("부서 테이블");
	
		System.out.printf("아이디:%3d 부서명:%-20s 메니저id:%3d 위치id:%4d\n", dto.getDEPARTMENT_ID(), dto.getDEPARTMENT_NAME(), dto.getMANAGER_ID(),dto.getLOCATION_ID());
			
	
		System.out.println("==========");
}
	public void regionView(List<RegionDTO> dtoList) {
		System.out.println("리지온 테이블");
		for(RegionDTO dto: dtoList) {
			System.out.printf("아이디:%3s 지역명:%-20s\n", dto.getREGION_ID(), dto.getREGION_NAME());
		}
		System.out.println("==========");
	}
	public void regionView(RegionDTO dto) {
		
		System.out.println("리지온 테이블");
		
		System.out.printf("아이디:%3s 지역명:%-20s\n", dto.getREGION_ID(), dto.getREGION_NAME());
		
		System.out.println("==========");
	}

}
