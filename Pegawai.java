/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak203;

public class Pegawai {

    public String nama;
    public String asal;
    public String jabatan;
    public int umur;
    
    public String getNama() {
    return nama;
    }
    
    //Error muncul karena String tidak bisa diubah ke Char (String X Char)
    //public String getAsal()
    public String getAsal() {
    return asal;
    }
    
    //Error muncul karena variabel yang diminta tidak ada (no requirements)
    //public void setJabatan() 
    public void setJabatan(String j){
    this.jabatan = j;
    }
    
    //Menambahkan Data usia
    public int getUmur(){
    return umur;    
    }

}
