import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;

import dao.ApprenticeModel;

public class Main {

	public static void main(String[] args){
		
		try{
			
			ApprenticeModel amodel = new ApprenticeModel();
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("List Apprentices");
			
//Create Heading
//First Row
			
			Row yoa = sheet.createRow(0);
			yoa.createCell(0).setCellValue("1. Ausbildungsjahr");
			yoa.createCell(3).setCellValue("2. Ausbildungsjahr");
			yoa.createCell(6).setCellValue("3. Ausbildungsjahr");
			
			sheet.addMergedRegion(new CellRangeAddress(
					0,0,0,1
			));
			sheet.addMergedRegion(new CellRangeAddress(
					0,0,3,4
			));
			sheet.addMergedRegion(new CellRangeAddress(
					0,0,6,7
			));
			
			
//Second Row
			
			Row specialization = sheet.createRow(1);
			specialization.createCell(0).setCellValue("FISI");
			specialization.createCell(1).setCellValue("FIAE");
	
			for( int i = 0; i<4; i++){
				
				CellStyle styleHeading = workbook.createCellStyle();
				Font font = workbook.createFont();
				font.setBold(true);
				font.setFontName(HSSFFont.FONT_ARIAL);
				font.setFontHeightInPoints((short) 12);
				styleHeading.setFont(font);
				sheet.autoSizeColumn(i);
//				styleHeading.setVerticalAlignment(CellStyle.ALIGN_CENTER);
				
			}
			
//Save to Excel
			
			FileOutputStream out = new FileOutputStream(new File("C:\\Users\\AbAl-Mas\\Desktop\\EinsatzplanTest\\einsatzplantest.xls"));
			workbook.write(out);
			out.close();
			workbook.close(); 
			System.out.println("excel written successfully");
			
			}catch(Exception e){
				
				e.printStackTrace();
				System.err.println("an error has occurred (Main.java)");
			
			}
	}
}