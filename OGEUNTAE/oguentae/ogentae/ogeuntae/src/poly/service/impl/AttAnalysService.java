package poly.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import poly.dto.AttAnalysDTO;
import poly.dto.AttMonthAnaDTO;
import poly.persistance.mapper.IEmpAttMapper;
import poly.persistance.mongo.IEmpAttMongoMapper;
import poly.persistance.mongo.IEmpAttMonthAnaMapper;
import poly.service.IAttAnalysService;
import poly.util.DateUtill;

@Service("AttAnalysService")
public class AttAnalysService implements IAttAnalysService {

	private Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "EmpAttMapper")
	IEmpAttMapper empAttMapper;
	
	@Resource(name = "EmpAttMongoMapper")
	IEmpAttMongoMapper empAttMongoMapper;
	
	@Resource(name = "EmpAttMonthAnaMapper")
	IEmpAttMonthAnaMapper empAttMonthAnaMapper;

	@Override
	public List<AttAnalysDTO> getAttInfo() {
		log.info("getAttInfo Start!");
		return empAttMapper.getAttInfo();
	}

	@Override
	public AttAnalysDTO getEmpCount() {
		return empAttMapper.getEmpCount();
	}
	// 몽고에서 데이터 가져오기(test)
	@Override
	public List<AttAnalysDTO> selectAttInfoForMongo() throws Exception {
		
		log.info(this.getClass().getName() + " selectAttInfoForMongo Start!!");
		
		String colNm = "AttInfoInsert_2021_05_22";
		
		List<AttAnalysDTO> rList = empAttMongoMapper.selectAttInfoForMongo(colNm);
		
		if(rList == null) {
			rList = new ArrayList<AttAnalysDTO>();
		}
		
		
		log.info(this.getClass().getName() + " selectAttInfoForMongo End!!");
		
		return rList;
	}
	// 지각자 수 분석 쿼리
	@Override
	public List<AttMonthAnaDTO> getAttMonthAna() throws Exception {
		
		String colFirstNm = "AttInfo_";
		String year = DateUtill.getDateTime("yyyy");
		String colNm = colFirstNm + year;
		
		List<AttMonthAnaDTO> rList = empAttMonthAnaMapper.getAttMonthAna(colNm);
		if(rList == null) {
			rList = new ArrayList<AttMonthAnaDTO>();
		}
		return rList;
	}


	
	

}
