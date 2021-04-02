/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspratikum3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Sequental {

   
    public static void main(String[] args) {
        System.out.println("SEQUENTIAL SEARCH");
       String nama[]={"Galileo","Archimedes","Alkhawarizmi","Aljabar","Nama Mahasiswa","Tesla"};
        System.out.println("Isi data adalah :");
        for(int i=0;i<nama.length;i++){
            System.out.print(nama[i]+" ");
        }
        System.out.println(" ");
        String cari;
        Scanner input=new Scanner(System.in);
        System.out.println("");
        System.out.println("Data yang ingin di cari: ");
        cari=input.nextLine();
        System.out.println(" ");
        for(int i=0;i<nama.length;i++){
            if(cari.equalsIgnoreCase(nama[i])){
                System.out.println("Data "+cari+ " berada di index ke : " +i+ " Baris ke : "+ (i+1));
                break;
            }
            
        }   
        System.out.println("");
        System.out.println("TERIMAKASIH ");
    }
    
}
