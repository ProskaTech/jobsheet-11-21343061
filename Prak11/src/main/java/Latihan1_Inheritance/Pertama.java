/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1_Inheritance;

/**
 *
 * Created by Nazwa Nurfadhilla Phitri
 */

public class Pertama {
    private int a = 10;
    
    protected void terpotek (){
        System.out.println("Method ini hanya untuk anaknya");
    }
   
  public void info (){
      System.out.println("a = " + a);
      System.out.println("Dipanggil pada = " + this.getClass() .getName());
  }
}
    
