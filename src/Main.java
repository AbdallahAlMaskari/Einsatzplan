import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;

import dao.ApprenticeModel;

public class Main {

	public static void main(String[] args){
		
		try{
			
			ApprenticeModel amodel = new ApprenticeModel();
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("List Apprentices");
//Create Heading
			Row rowHeading = sheet.createRow(0);
			rowHeading.createCell(0).setCellValue("surname");
			rowHeading.createCell(1).setCellValue("name");
			rowHeading.createCell(2).setCellValue("specialization");
			rowHeading.createCell(4).setCellValue("year of apprenticeship");
			
			for( int i = 0; i<4; i++){
				
				CellStyle styleHeading = workbook.createCellStyle();
				Font font = workbook.createFont();
				font.setBold(true);
				font.setFontName(HSSFFont.FONT_ARIAL);
				font.setFontHeightInPoints((short) 12);
				styleHeading.setFont(font);
//				styleHeading.setVerticalAlignment(CellStyle.ALIGN_CENTER);
				rowHeading.getCell(i).setCellStyle(styleHeading);
				
			}
			
		}catch(Exception e){
			
			System.err.println("");
			
		}
		

	
			
		

			
			
	}

}