/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Cuong Pham
 */
public class Mainbt1 {
    
    public static void main(String[] args) {
        Context ct = new Context();
        ct.setTinhToan(new Cong());
        
        System.out.println("thực hiện phép tính cộng (75 + 12):"+ ct.Tinh(75,12));
        
        ct.setTinhToan(new Tru());
        
        System.out.println("thực hiện phép tính trừ ( 54 - 78) :"+ ct.Tinh(54,78));
    }
    
}
