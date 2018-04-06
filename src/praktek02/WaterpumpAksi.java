/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author LENOVO 320
 */
public class WaterpumpAksi {
    public static void main(String[] args) {
        Waterpump nasional = new Waterpump();
        
        
       nasional.Nama="nasional Waterpump";
       nasional.pabrik="china";
       nasional.warna="biru";
       nasional.harga= 200.000;
       
       nasional.cetakInfo();
       
    }
    
}
