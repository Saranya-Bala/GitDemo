import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelData {
	public String getData() throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Eclipse\\Demo.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		String search="";
		int sheetNo=workbook.getNumberOfSheets();
		for(int i=0;i<sheetNo;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("SearchData")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> row=sheet.iterator();
				Row firstRow=row.next();
				Iterator<Cell> cell=firstRow.cellIterator();
				int col=0,k=0;
				while(cell.hasNext()) {
					Cell ce=cell.next();
					if(ce.getStringCellValue().equalsIgnoreCase("Search")) {
						col=k;
					}k++;
				}System.out.println(col);
				Row secondRow=row.next();
				search=secondRow.getCell(0).getStringCellValue();
				
			}
		}return search;
		
		
		
	}

}
