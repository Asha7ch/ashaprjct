package com.acttime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jboss.netty.handler.codec.protobuf.ProtobufEncoder;


public class FileData {
	
	public String getExcelData(String sheetNAme , int rowNum , int colNum) throws Throwable, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNAme);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
		return data;
	}
	
	public Properties getPropertyObject() throws Throwable{
		FileInputStream fis = new FileInputStream("./testData/config.properties");
        Properties pObj = new Properties();
        pObj.load(fis);
        return pObj;
	}

}
