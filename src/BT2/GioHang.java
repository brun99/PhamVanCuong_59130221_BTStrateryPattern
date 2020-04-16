/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.ArrayList;

/**
 *
 * @author Cuong Pham
 */
public class GioHang extends HangHoa{
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dshh = new ArrayList<>();
    
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void them(HangHoa hh){
        dshh.add(hh);
    }
    public int tinhTienH(){
        int s =0;
        for(int i=0; i<dshh.size(); i++){
            s = s +dshh.get(i).getGia();
        }
        return s;
    }
    public double tienTra(){
    return hinhThucTT.thanhToan(tinhTienH());
    }
    
    @Override
    public void hienThi(){
     for(int i=0; i<dshh.size(); i++){
         System.out.println("hang hoa thu :"+(i+1));
         dshh.get(i).hienThi();
        }
    }
}
