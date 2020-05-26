package com.example.springbootmybatis;

import com.example.springbootmybatis.entity.User;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Test
    void contextLoads() throws IOException {
//        FileReader fr = new FileReader("/Users/yangyuhang/IdeaProjects/" +
//                "springboot-mybatis/src/main/resources/static/mysqltest.xls");
//
//        int ch = 0;
//
//        while ((ch = fr.read()) != -1) {
//            System.out.print((char)ch);
//        }
//        System.out.println("用户的当前工作目录:/n"+System.getProperty("user.dir"));


////        ReadExcel excel = new ReadExcel();
//        String excelName = "/Users/yangyuhang/IdeaProjects/" +
//                "springboot-mybatis/src/main/resources/static/mysqltest.xls";					// 指定Excel文件名称
//        showExcel(excelName);


        User user = new User();
        System.out.println(user.getId());
        changeid(user);
        System.out.println(user.getId());


    }

    public User changeid(User user){
        user.setId(12);
        return user;
    }


    public void showExcel(String excelName) {				// 读Excel文件内容
        File file = new File(excelName);
        FileInputStream in = null;
        try {
            in = new FileInputStream(file); 					// 创建对Excel工作簿文件的引用
            HSSFWorkbook hwb = new HSSFWorkbook(in);
            HSSFSheet sheet = hwb.getSheet("Sheet1");	// 根据指定的名字来引用有效工作表
            // 读取Excel 工作表的数据
            System.out.println("下面是Excel文件" + file.getAbsolutePath() + "的内容：");
            HSSFRow row = null;
            HSSFCell cell = null;
            int rowNum = 1; 							// 行标
            int colNum; 							// 列标

            while (true){
                row = sheet.getRow((short) rowNum); 		// 获取第rowNum行
                colNum = 0;
                while (true){
                    try{
                        cell = row.getCell((short) colNum);		// 根据当前行的位置来创建一个单元格对象
                        System.out.print(cell.getStringCellValue() + "\t");// 获取当前单元格中的内容
                    } catch (IllegalStateException e){
                        System.out.print((int)cell.getNumericCellValue() + "\t");
                    }catch (NullPointerException e){
                        break;
                    }
                    colNum++;

                }
                rowNum++;
                if (colNum == 0){
                    break;
                }
                System.out.println();
            }
            in.close();
        } catch (Exception e) {
            System.out
                    .println("读取Excel文件" + file.getAbsolutePath() + "失败：" + e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e1) {
                }
            }
        }
    }

}
