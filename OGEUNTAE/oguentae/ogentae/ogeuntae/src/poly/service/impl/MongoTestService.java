package poly.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import poly.persistance.mongo.IMongoTestMapper;
import poly.service.IMongoTestService;

@Service("MongoTestService")
public class MongoTestService implements IMongoTestService{
	// 싱글톤 패턴 서비스를 메모리에 적재
	@Resource(name = "MongoTestMapper")
	private IMongoTestMapper mongoTestMapper;
	
	private Logger log = Logger.getLogger(this.getClass());
	// 접속 확인용
	@Override
	public boolean createColection() throws Exception {
		log.info(this.getClass().getName() + ".createcollection Start!");
		
		String colNm = "MyTestCollection";
		
		return mongoTestMapper.createCollection(colNm);
	}

}
