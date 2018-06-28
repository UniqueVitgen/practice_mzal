package com.springapp.light.util.exel;

import com.springapp.light.domain.AutomatedLine;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

public class ParserExcelAutomatedLine {

    private static Workbook getWorkbook(FileInputStream inputStream, String excelFilePath) throws IOException {
        Workbook workbook = null;
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        }
        return workbook;
    }


    public static AutomatedLine readAutomatedLine(File file) throws IOException{

        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = getWorkbook(fis,file.getPath());
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = firstSheet.iterator();
        DataFormatter df = new DataFormatter();

        AutomatedLine AutomatedLine = new AutomatedLine();

        df.formatCellValue(rowIterator.next().getCell(1)).trim();
        printInFile("readAutomatedLine.txt", "1");



//        AutomatedLine.setType(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        printInFile("readAutomatedLine.txt", "2 setType = " + AutomatedLine.getType());
//
//        AutomatedLine.setModel(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        printInFile("readAutomatedLine.txt", "3 getModel = " + AutomatedLine.getModel());
//
//        df.formatCellValue(rowIterator.next().getCell(1)).trim();
//        AutomatedLine.setUrl(getUrl(AutomatedLine.getModel())); AutomatedLine.setId(getID(AutomatedLine.getModel()));
//        printInFile("readAutomatedLine.txt", "4 setUrl"  );
//
//        AutomatedLine.setManufacturer(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        printInFile("readAutomatedLine.txt", "5 setManufacturer = " + AutomatedLine.getManufacturer());
//
//        AutomatedLine.setCountry(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        printInFile("readAutomatedLine.txt", "6 setCountry = " + AutomatedLine.getCountry());
//
//        AutomatedLine.setDiffuser(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        printInFile("readAutomatedLine.txt", "7 setDiffuser = " + AutomatedLine.getDiffuser());
//
//        AutomatedLine.setPower(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        printInFile("readAutomatedLine.txt", "8 setPower = " + AutomatedLine.getPower());
//
//        AutomatedLine.setLuminousFlux(intFromCell(rowIterator, df));
//        AutomatedLine.setLuminousFluxEmergency(intFromCell(rowIterator, df));
//        AutomatedLine.setTemperatureGlow(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setSize(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setSizeInstallation(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//
//        AutomatedLine.setCoefficientPulsation(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setCoefficientPower(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setTypeLidc(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setIndexColor(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setSecurity(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setWeight(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setTemperatureWork(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//
//        AutomatedLine.setGuarantee(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        printInFile("readAutomatedLine.txt", "21 setGuarantee = " + AutomatedLine.getGuarantee());
//
//        AutomatedLine.setDimmingFunction(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setMountingType(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//
//        rowIterator.next().getCell(1);
//
//        AutomatedLine.setPhoto1(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setPhoto2(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setPhoto3(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setPhoto4(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setPhoto5(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//
//
//        AutomatedLine.setDescriptionEn(df.formatCellValue(rowIterator.next().getCell(1)).trim());
//        AutomatedLine.setVideo1(df.formatCellValue(rowIterator.next().getCell(1)).trim());

        fis.close();
        return AutomatedLine;
    }

    private static String getUrl (String str){
        return   str.replaceAll(" ", "-")
                .replaceAll("'", "-")
                .replaceAll("\"", "-")
                .replaceAll(",", "-")
                .replaceAll(":", "-")
                .replaceAll(";", "-")
                .replaceAll("\\.", "-")
                .replaceAll("&", "-")
                .replaceAll("/", "-")
                .replaceAll("\\|", "-") // ??
                .replaceAll("!", "-")
                .replaceAll("\\?", "-")
                .replaceAll("\\(", "-")
                .replaceAll("\\)", "-")
                .replaceAll("---", "-")
                .replaceAll("--", "-")
                .replaceAll("--", "-") ;
    }
    private static String getID (String str){
        return   str.replaceAll(" ", "")
                .replaceAll("'", "")
                .replaceAll("\"", "")
                .replaceAll(",", "")
                .replaceAll(":", "")
                .replaceAll(";", "")
                .replaceAll("\\.", "")
                .replaceAll("&", "")
                .replaceAll("/", "")
                .replaceAll("\\|", "") // ??
                .replaceAll("!", "")
                .replaceAll("\\?", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "")
                .replaceAll("---", "")
                .replaceAll("--", "")
                .replaceAll("--", "") ;
    }

    private static int intFromCell (Iterator<Row> rowIterator, DataFormatter df ){
        int tt;
        Row tmp = rowIterator.next();
        try {
            tt = (int)tmp.getCell(1).getNumericCellValue();
        } catch (Exception e) {
            tt = Integer.parseInt( df.formatCellValue(tmp.getCell(1)).trim());
        }
        return tt;
    }

    static void printInFile(String fileName, String str){    // For Check             
        File file = new File("d:\\2\\"+fileName);
//            File file = new File("HMC exeption2.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("-------> "+new Date()+"): \n");
            fileWriter.write(str + "\n\n");
        } catch (IOException ex) {
//            Logger.getLogger(ControllerMachine.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
