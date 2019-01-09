package POClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelRead {
	
	@SuppressWarnings("null")
	public String[] readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    File file = new File(filePath+"\\"+fileName);

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook workbook = null;

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    if(fileExtensionName.equals(".xls")){

	    	workbook = new HSSFWorkbook(inputStream);

	    }

	    Sheet sheet = workbook.getSheet(sheetName);

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    
	    String[] cellData = null;

	    for (int i = 1; i < rowCount+1; i++) {

	        Row row = sheet.getRow(i);

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            String cellData1 = row.getCell(j).getStringCellValue();
	            cellData[j] = cellData1;

	        }

	        System.out.println();

	    }
	    return cellData;
	}
}
