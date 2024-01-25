package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class DataDrivenTestingEg {

	public static void main(String[] args) throws Exception{
		
		// Excel -> WorkBook -> Sheet -> Row -> Cell
		
		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;
//		XSSFRow Row;
//		XSSFCell Cell;
		
		//create an object of File class to open file
		File excelFile = new File("C:\\SSquareit\\TestData.xlsx");
		
		//create an object of FileInputStread to read data from file
		FileInputStream inputStream = new FileInputStream(excelFile);
		
		//create object of XSSFworkbook to handle xlsx file
		ExcelWBook = new XSSFWorkbook(inputStream);
		
		//To access workbook sheet
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		
		//To get total row count
		int totalRows = ExcelWSheet.getLastRowNum() + 1;
		
		//To get total no. of cells in a row
		int totalCells = ExcelWSheet.getRow(0).getLastCellNum();
		
		for(int currentRow = 0; currentRow < totalRows; currentRow++) //To read Row 
		{
			for(int currentCell = 0; currentCell < totalCells; currentCell++) //To read Cell
			{
				String cell = ExcelWSheet.getRow(currentRow).getCell(currentCell).toString();
				System.out.print(cell);
				System.out.print("\t");
			}
			System.out.println("\n");
		}	
		ExcelWBook.close();
	}
}
