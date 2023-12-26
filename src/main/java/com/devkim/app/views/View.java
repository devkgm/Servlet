package com.devkim.app.views;

import java.util.List;

import com.devkim.app.departments.DepartmentDTO;
import com.devkim.app.employees.EmployeeDTO;
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
	public void employeeView(List<EmployeeDTO> dtoList) {
		System.out.println("임플로이 테이블");
		for(EmployeeDTO dto: dtoList) {
			System.out.printf("아이디:%3s 성:%12s 이름:%12s 이메일:%10s 전화번호:%20s 고용일:%10s 직무:%12s 급여:%8.1f 커미션:%8.1f 상사:%3d 부서:%3d\n", dto.getEmployee_id(), dto.getFirst_name(),dto.getLast_name(),dto.getEmail(), dto.getPhone_number(), dto.getHire_date().toString(),dto.getJob_id(),dto.getSalary(),dto.getCommission_pct(), dto.getManager_id(), dto.getDepartment_id());
		}
		System.out.println("==========");
	}
	public void employeeView(EmployeeDTO dto) {
		
		System.out.println("임플로이 테이블");
		
		
		System.out.printf("아이디:%3s 성:%12s 이름:%12s 이메일:%10s 전화번호:%20s 고용일:%10s 직무:%12s 급여:%8.1f 커미션:%8.1f 상사:%3d 부서:%3d\n", dto.getEmployee_id(), dto.getFirst_name(),dto.getLast_name(),dto.getEmail(), dto.getPhone_number(), dto.getHire_date().toString(),dto.getJob_id(),dto.getSalary(),dto.getCommission_pct(), dto.getManager_id(), dto.getDepartment_id());
	

		System.out.println("==========");
	}

}
