package utils;


import com.spire.xls.FileFormat;
import com.spire.xls.Workbook;
import com.spire.xls.Worksheet;
import com.spire.xls.collections.WorksheetsCollection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ExcelAutoFit {
    /**
     * 自适应行高列宽
     * @param fileName：变更前文件名
     * @param fileName2：变更后文件名
     */
    public void AutoFit(String fileName,String fileName2){
        Workbook wb = new Workbook();
        wb.loadFromFile(fileName);
//        Worksheet sheet = wb.getWorksheets().get(0);
//        System.out.println(sheet);
        WorksheetsCollection sheets = wb.getWorksheets();
//        System.out.println(sheets);
        for( Object sheetsheet:sheets){
            Worksheet sheetsheet2 = (Worksheet)sheetsheet;
            sheetsheet2.getAllocatedRange().autoFitRows();
            sheetsheet2.getAllocatedRange().autoFitColumns();
        }

        wb.saveToFile(fileName2, FileFormat.Version2010);
    }

    /**
     * 路径下所有文件的遍历
     * @param filePath
     * @return
     */
    public  List<File> getFileList(String filePath){
            File dir = new File(filePath);
            File[] files = dir.listFiles();
            List<File> filelist = new ArrayList<File>();
//            List filelist=null;
            if(files!=null){
                for(int i =0;i<files.length;i++){
                    String fileName = files[i].getName();
                    if(files[i].isDirectory()){
                        getFileList(files[i].getAbsolutePath());

                    }else if(fileName.endsWith("xlsx")){
                        String strFileName = files[i].getAbsolutePath();
                        System.out.println("---" + strFileName);
                        filelist.add(files[i]);
                    }else {
                        continue;
                    }
                }
            }
            return filelist;
    }

//    public ArrayList<File> traverseFolder2(String path) {
//
//        File file = new File(path);
//        ArrayList<File> fileList = new ArrayList<File>();
//        if (file.exists()) {
//            File[] files = file.listFiles();
//            if (null == files || files.length == 0) {
//                System.out.println("文件夹是空的!");
//            } else {
//                for (File file2 : files) {
//                    if (file2.isDirectory()) {
//                        System.out.println("文件夹:" + file2.getAbsolutePath());
//                        traverseFolder2(file2.getAbsolutePath());
//                    } else {
//                        System.out.println("文件:" + file2.getAbsolutePath());
//                        fileList.add(file2.getAbsolutePath());
//
//                    }
//                }
//            }
//        } else {
//            System.out.println("文件不存在!");
//        }
//        return fileList;
//    }


    public static void main(String[] args) {
        ExcelAutoFit eat = new ExcelAutoFit();
        List<File> fileList = new ArrayList<File>();
        List<File> fileList2 = new ArrayList<File>();
        fileList = eat.getFileList("D:\\test");
//        System.out.println(fileList);
//        System.out.println(eat.getFileList("D:\\test").getClass());
        for(int i = 0;i<fileList.size();i++){
            fileList2.add(new File(fileList.get(i).toString().replaceFirst("D", "E")));
        }
        for (int i = 0;i<fileList.size();i++){
            for (int j =0;j<fileList2.size();j++){
                eat.AutoFit(fileList.get(i).toString(),fileList2.get(j).toString());
            }
        }
    }
}
