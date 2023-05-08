package SSG;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T_Exercise {

    @Test
    public void test01() throws IOException {
        //Excel dosyasından bir veri okuyabilmemiz için;
        //1-Dosya yolunu alırız
        String dosyaYolu = "src/test/java/resourses/Capitals.xlsx";

        //2-Dosyayı okuyabilmek için akışa almam gerekir
        FileInputStream oku = new FileInputStream("src/test/java/resourses/Capitals.xlsx");//bu sekilde de yapistırabilirim
        //Ya da dosya yolunu bir string'e assing edip akisa alırken olusturdugum degeri de yapistirabilirim
        FileInputStream oku1 = new FileInputStream(dosyaYolu);//2. yontem bu sekilde olabilir

        //3-Java ortamında bir excel dosyası oluşturmamız gerekir
        Workbook workbook = WorkbookFactory.create(oku);

        //4-Sayfayı(Sheet) seçmemiz gerekir
        Sheet sheet = workbook.getSheet("Sheet1");

        //5-Satır(Row) seçmemiz gerekir
        Row row = sheet.getRow(0);    //1.satır çünkü index 0 dan başlar

        //6-Hücreyi(Cell) seçmemiz gerekir
        Cell cell = row.getCell(0);  //1.sütun çünkü index 0 dan başlar
        System.out.println(cell);

        System.out.println(workbook.getSheet("sheet1").getRow(3).getCell(1));
        System.out.println(workbook.getSheet("sheet1").getLastRowNum());


    }

    @Test
    public void test02() throws IOException {
        FileInputStream oku = new FileInputStream("src/test/java/resourses/Capitals.xlsx");
        Workbook workbook = WorkbookFactory.create(oku);
        String satir4sutun2 = workbook.getSheet("sheet1").getRow(4).getCell(1).toString();
        System.out.println(satir4sutun2);
    }
}