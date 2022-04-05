package bai9;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {



            TinhToan tt1 = new TinhToan(5, 25);
            TinhToan tt2 = new TinhToan(37, 27);
            TinhToan tt3 = new TinhToan(3, 0);

            System.out.printf("Tong = " + tt3.cong(tt1, tt2));
            System.out.printf("\nHieu = " + tt3.tru(tt1, tt2));
            System.out.printf("\nTich = " + tt3.nhan(tt1));
            System.out.printf("\nThuong = " + tt3.chia(tt1));


        System.out.println("Create file excel");

//        try {
//            File f = new File("C:/Local Disk (D)/OMRE_AutomationClass/FilePhanSo2.txt");
//            FileWriter fw = new FileWriter(f);
//            fw.write("Ghi character");

        //XSSFWorkbook workbook = new XSSFWorkbook("C:\\Local Disk (D)\\OMRE_AutomationClass\\FilePhanSo.xlsx");
        //XSSFSheet sheet = workbook.createSheet("PhanSo");
//        int rowNum = 0;
//        Row firstRow = sheet.createRow(rowNum++);
//        Cell firstCell = firstRow.createCell(0);
//        firstCell.setCellValue("List of Phan So");
        //ListPhanSo listOfPhanSo = new ListPhanSo(1, tt3.cong(tt1,tt2), tt3.tru(tt1,tt2), tt3.nhan(tt1),tt3.chia(tt1));

        // dos.writeObject(listOfPhanSo);
        //for (ListPhanSo ListPhanSo : listOfPhanSo) {
//            Row row = sheet.createRow(rowNum++);
//            Cell cell1 = row.createCell(0);
//            cell1.setCellValue(ListPhanSo.getId());
//            Cell cell2 = row.createCell(1);
//            cell2.setCellValue(String.valueOf(ListPhanSo.getCong()));
//            Cell cell3 = row.createCell(2);
//            cell3.setCellValue(String.valueOf(ListPhanSo.getTru()));
//            Cell cell4 = row.createCell(3);
//            cell3.setCellValue(String.valueOf(ListPhanSo.getNhan()));
//            Cell cell5 = row.createCell(4);
//            cell3.setCellValue(String.valueOf(ListPhanSo.getChia()));


//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassCastException e){
//            e.printStackTrace();
//        }
//        System.out.println("Done");


//                File file = null;
//                FileOutputStream fileOutputStream = null;
//                String[] Str = new String[4];
//                Str[0] = String.valueOf(tt3.cong(tt1, tt2));
//                Str[1] = String.valueOf(tt3.tru(tt1, tt2));
//                Str[2] = String.valueOf(tt3.nhan(tt1));
//                Str[3] = String.valueOf(tt3.chia(tt1));
//
//                try {
//                    file = new File("C:\\Local Disk (D)\\OMRE_AutomationClass\\test.txt");
//                    fileOutputStream = new FileOutputStream(file);
//                    //create file if not exists
//                    if (!file.exists()) {
//                        file.createNewFile();
//                    }
//                    //fetch bytes from data
//                    String bs = String.valueOf(Str);
//                    fileOutputStream.write(bs);
//                    fileOutputStream.flush();
//                    fileOutputStream.close();
//                    System.out.println("File written successfully.");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    try {
//                        if (fileOutputStream != null) {
//                            fileOutputStream.close();
//                        }
//                    } catch (Exception e2) {
//                        e2.printStackTrace();
//                    }

            }

        }


