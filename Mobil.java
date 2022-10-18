/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak202;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Mobil {
    
    public String merek;
    public String tahun_keluaran;
    public int kapasitas;
    public int harga;
    private String pemilik;
    private int pajak;
    
    public void setPemilik (String pmk){
        pemilik = pmk;
    }
    
    public void setPajak (int pjk) {
        pajak = pjk;
    }
    
    public String getPemilik (String pmk){
        return pemilik ;
    }
    
    public int  getPajak (int pjk) {
        return pajak = (harga * 2) / 100;
    }
    
    public void info () {        
        
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

    formatRp.setCurrencySymbol("Rp. ");
    formatRp.setMonetaryDecimalSeparator(',');

    kursIndonesia.setDecimalFormatSymbols(formatRp);

    System.out.println("Merek Mobil: " + merek);
    System.out.printf("Harga: %s %n", kursIndonesia.format(harga));
    System.out.println("Tahun Keluaran : " + tahun_keluaran);
    System.out.println("Kapasitas : " + kapasitas + "cc");
    
    }
   
}
