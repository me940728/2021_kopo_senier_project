package poly.util;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

// import org.apache.log4j.Logger;

import au.com.bytecode.opencsv.CSVWriter;


public class CsvCreate {
	private Logger log = Logger.getLogger(this.getClass());
	
	public int makeCsv() {
		
		 //========가상의 DB조회리스트========
        Map<String, Object> hmap = null;
        ArrayList<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
        
        String folderPath = "C:\\Users\\CHOI\\Desktop\\csvLog";
        File makeFolder = new File(folderPath);
        // 날짜 포맷 지정 객체, 날짜 데이터 뽑아오는 객체 
        SimpleDateFormat format = new SimpleDateFormat("yy_MM_dd");
        Date time = new Date();
        String date = format.format(time);
         
        hmap = new HashMap<String, Object>();
        hmap.put("one", 1);
        hmap.put("two", "한글1");
        list.add(hmap);
         
        hmap = new HashMap<String, Object>();
        hmap.put("one", 11);
        hmap.put("two", "한글22");
        list.add(hmap);
         
        hmap = new HashMap<String, Object>();
        hmap.put("one", 111);
        hmap.put("two", "한글3");
        list.add(hmap);
        //========가상의 DB조회리스트========
        
        // folderPath의 디렉토리가 존재하지 않을경우 디렉토리 생성.
        if(!makeFolder.exists()) {
            
            // 폴더를 생성합니다.
            makeFolder.mkdir(); 
            log.info("폴더 생성");
            
            // 정성적으로 폴더 생성시 true를 반환합니다.
            log.info("폴더가 존재하는지 체크 true/false : "+makeFolder.exists());
            
        } else {
        	log.info("이미 해당 폴더가 존재합니다.");
        }
        //=======================디렉터리 생성 체크 후 ========================
         
        try {
            /**
             * csv 파일을 쓰기위한 설정
             * 설명
             * D:\\test.csv : csv 파일저장할 위치+파일명
             * EUC-KR : 한글깨짐설정을 방지하기위한 인코딩설정(UTF-8로 지정해줄경우 한글깨짐)
             * ',' : 배열을 나눌 문자열
             * '"' : 값을 감싸주기위한 문자
             **/
            CSVWriter cw = new CSVWriter
            		(new OutputStreamWriter
            		(new FileOutputStream(folderPath + "\\" + date + "_test.csv"), "EUC-KR"),',', '"');
            try {
                for(Map<String, Object> m : list) {
                    //배열을 이용하여 row를 CSVWriter 객체에 write
                    cw.writeNext(new String[] { String.valueOf(m.get("one")),String.valueOf(m.get("two"))});
                }  
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                //무조건 CSVWriter 객체 close
                cw.close();
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return 1;
	}

}
