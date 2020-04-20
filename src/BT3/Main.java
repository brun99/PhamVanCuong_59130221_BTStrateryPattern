/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Cuong Pham
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        QLSV sv = new QLSV();
        // khai báo ngày tháng 
        SimpleDateFormat dt = new SimpleDateFormat("dd:MM:yyyy");
        SinhVien sv1 = new SinhVien("phạm văn cường", dt.parse("10/05/1999"), 8);
        SinhVien sv2 = new SinhVien("đỗ văn a", dt.parse("20/07/1999"), 7);
        SinhVien sv3 = new SinhVien("lê thành đạt", dt.parse("01/03/1999"), 6);
        
       sv.them(sv1);
       sv.them(sv2);
       sv.them(sv3);
       System.out.println("danh sach sinh vien:");
       sv.InDS();
       
       ISoSanh ss1 = new SoSanhTheoTen();
       ISoSanh ss2 = new SoSanhTheoDiem();
       sv.setSS(ss2);
       sv.SapXep();
       System.out.println("sap xep danh sach theo diem :");
       sv.InDS();
       
       
       sv.setSS(ss1);
       sv.SapXep();
       System.out.println("so sanh theo tên :");
       sv.InDS();
    }
}
