/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Cuong Pham
 */
public class QLSV {
    ISoSanh SS;
    ArrayList<SinhVien> ds = new ArrayList<>();

    public QLSV() {
    }
    public QLSV(ISoSanh SS){
    this.SS = SS;
    }

    public void setSS(ISoSanh SS) {
        this.SS = SS;
    }
    
    public void SapXep(){
    for(int i=0; i<ds.size();i++ )
        for(int j=i+1; j<ds.size(); j++){
            if(SS.soSanh(ds.get(i), ds.get(j)) > 0)
                Collections.swap(ds, i, j);
        }
    }
    public void InDS(){
        for(int i=0; i<ds.size(); i++)
            ds.get(i).HienThi();
    }

    void them(SinhVien sv) {
        ds.add(sv);
    }
}
