/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak201;

public class PRAK201 {

    public String name;
    public double weight;
    public int tbuy;
    public double tweight;
    public int tprice;

    public void display()
    {
    System.out.println("Nama Mangga: " + name);
    System.out.println("Berat: " + weight + " kg ");
    System.out.println("Jumlah Beli: " + tbuy);
    System.out.println("Total Berat: " + tweight + " kg ");
    System.out.println("Total harga: Rp. " + tprice);
    }
    
    public static void main(String[] args) {
    
    PRAK201 mango1, mango2, mango3;

    mango1 = new PRAK201();
    mango2 = new PRAK201();
    mango3 = new PRAK201();
    
    mango1.name ="Arumanis";
    mango1.weight = 0.3;
    mango1.tbuy = 13;
    mango1.tweight = 3.9;
    mango1.tprice = 65000;
    System.out.println("Fruit Data 1:");
    mango1.display();
    
    mango2.name ="Manalagi";
    mango2.weight = 0.5;
    mango2.tbuy = 17;
    mango2.tweight = 8.5;
    mango2.tprice = 127500;
    System.out.println("Fruit Data 2:");
    mango2.display(); 
    
    mango3.name ="Mangga Madu";
    mango3.weight = 0.375;
    mango3.tbuy = 12;
    mango3.tweight = 4.5;
    mango3.tprice = 78000;
    System.out.println("Fruit Data 3:");
    mango3.display();
    
    }
    
}
