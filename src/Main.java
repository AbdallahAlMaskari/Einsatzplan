import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet[] sheets = new XSSFSheet[0];
		
		workbook.createSheet();
		
		// Create Heading
		
		try{
			
			Row rowHeading = sheets[0].createRow(0);
			rowHeading.createCell(0).setCellValue("Surname");
			rowHeading.createCell(1).setCellValue("Name");
			rowHeading.createCell(2).setCellValue("formingdirection");
			rowHeading.createCell(3).setCellValue("Specialization");
			rowHeading.createCell(4).setCellValue("Year of Apprenticeship");
			
			for(int i = 0; i < 5; i++){
				
				CellStyle stylerowHeading = workbook.createCellStyle();
				Font font = workbook.createFont();
				font.setBold(true);
				font.setFontName(XSSFFont.DEFAULT_FONT_NAME);
				font.setFontHeightInPoints((short) 11);
				stylerowHeading.setFont(font);
				//stylerowHeading.setVerticalAlignment(CellStyle.ALIGN_CENTER);
				rowHeading.getCell(i).setCellStyle(stylerowHeading);
				
			}
			
			//Save to Excel
			
			FileOutputStream out = new FileOutputStream(new File("C:\\Einsatzplan\\Einsatzplan.xls"));
			workbook.write(out);
			out.close();
			workbook.close();
			System.out.println("Excel written successfully!");
			
		} catch (Exception e){
			
			System.out.println(e.getMessage());
			
		}
		
	}

}