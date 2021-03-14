package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public String[][] excelRead(String fileName) throws IOException {
		//step1: Get into the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
				
		//step2: get into worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//to get the number of rows in the excel sheet
		int rowCount = ws.getLastRowNum(); // exclude the header for counting
		
		//to get the number of cells in a row
		int cellCount = ws.getRow(0).getLastCellNum();
		
		//declare 2D string array
		String[][] data = new String[rowCount][cellCount];
		
		for (int i = 1; i <= rowCount; i++) { //row
			
			for (int j = 0; j < cellCount; j++) { // cell
				
				String value = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				
				data[i-1][j] = value;
			}
			
		}
		
		//to close the workbook
		wb.close();
	
		return data;
		
		
		
		
		

		
		//Step3: get into the row
		//XSSFRow row = ws.getRow(i);
		
		//Step4: get into the cell
		//XSSFCell cell = row.getCell(0);
		
		//Step4: to read the cell value
		//String value = cell.getStringCellValue();
		
		
	}

}
