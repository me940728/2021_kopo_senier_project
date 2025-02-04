package poly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import poly.dto.EmpDTO;
import poly.persistance.mapper.IEmpMapper;
import poly.service.IEmpService;
import poly.util.CmmUtil;

@Service("EmpService")
public class EmpService implements IEmpService {

	private Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "EmpMapper")
	IEmpMapper empMapper;
	
	// 2번 째 호출
	// 직원 정보 가져오는 메서트 오버라이딩 해서 리턴을 메퍼로! 
	@Override
	public List<EmpDTO> getEmpList() {

		return empMapper.getEmpList();
	}

	// 직원 등록 중복 확인용
	@Override
	public EmpDTO getEmployExists(EmpDTO pDTO) throws Exception {
		return empMapper.getEmployExists(pDTO);
	}

	@Override
	public int insertEmpInfo(EmpDTO pDTO) throws Exception {
		log.info("emp 등록 실시");
		int res = 0;
		// 직원 등록 매퍼로 연결
		int success = 0;
		// 중복 가입 확인용 DTO
		EmpDTO rDTO = empMapper.getEmployExists(pDTO);
		
		if (CmmUtil.nvl(rDTO.getExists_yn()).equals("Y")) {
			log.info("직원 정보가 이미 등록되어 있습니다.");
			res = 2;
		} else {
			// 데이터 체크용
			success = empMapper.insertEmpInfo(pDTO);
			
			if (success > 0) {
				log.info("직원 등록 성공!! 1 == " + success); // 1 이상이여야 성공
				res = 1;
			} else {
				log.info("직원 등록 실패.... 0 == " + success);
			}
		}
		
		log.info("직원 등록 종료");
		return res;
	}
	
	// 유저 정보 상세 보기(수정을 위한 )
	@Override
	public List<EmpDTO> getEmpDetail(EmpDTO pDTO) {

		return empMapper.getEmpDetail(pDTO);
	}

	// 유저 정보 수정
	@Override
	public int UpdateEmpInfo(EmpDTO pDTO) throws Exception {
		log.info("emp 수정 실시");
		
		int res = 0;
		int success = 0;
		
		success = empMapper.updateEmpInfo(pDTO);
		
		if(success > 0) {
			res = 1;
		} else {
			res = 0;
		}
		log.info("직원 수정 종료");
		return res;
	}
	// 유저 정보 삭제 프로세스
	@Override
	public int empDeleteInfo(String empno) {		
		log.info(this.getClass().getName() + "delete Proc Start");
		
		log.info("empno : " + empno);
		EmpDTO pDTO = new EmpDTO();
		
		pDTO.setEmpno(empno);
		

		int res = empMapper.deleteEmpInfo(pDTO);
		
		if (res == 1) {
			log.info("삭제 성공");
		} else {
			log.info("삭제 실패");
		}
		
		log.info(this.getClass().getName() + "delete Proc END");
		return res;
	}
	// 프로필 사진 저장
	@Override
	public int InsertImgStorage(EmpDTO pDTO) {
		return empMapper.InsertImgStorage(pDTO);
		
	}

}
