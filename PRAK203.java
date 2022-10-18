/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak203;

public class PRAK203 {

    public static void main(String[] args) {

    Pegawai p1 = new Pegawai();
    
    //Error muncul karena tidak ada titik koma di akhir baris (;)
    //p1.nama = "Roi"
    p1.nama = "Roi";
    
    //Error muncul karena String tidak bisa diubah ke Char (String X Char)
    p1.asal = " Kingdom of Orvel" ;
    
    //Error muncul karena variabel yang diminta tidak ada (no requirements)
    p1.setJabatan("Assasin");
    
    //Menambahkan Data Umur
    p1.umur= 20;

    System.out.println("Nama Pegawai: " + p1.getNama());
    System.out.println("Asal: " + p1.getAsal());
    System.out.println("Jabatan: " + p1.jabatan);
    System.out.println("Umur: " + p1.umur);

    }
    
}