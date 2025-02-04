package poly.service;

import java.util.List;

import poly.dto.EmpDTO;

public interface IEmpService {
	// 직원 정보 등록 메서드
	int insertEmpInfo(EmpDTO pDTO) throws Exception; 
	// 직원 등록 중복 체크용
	EmpDTO getEmployExists(EmpDTO pDTO) throws Exception;
	// 직원 리스트 가져오는 메서드 인터페이스
	List<EmpDTO> getEmpList();
	// 유저 정보 뺴오기
	List<EmpDTO> getEmpDetail(EmpDTO pDTO);
	// 유저 정보 수정
	int UpdateEmpInfo(EmpDTO pDTO) throws Exception;
	
	// emp 정보 삭제
	int empDeleteInfo(String empno);
	// 이미지 저장
	int InsertImgStorage(EmpDTO pDTO);


}
