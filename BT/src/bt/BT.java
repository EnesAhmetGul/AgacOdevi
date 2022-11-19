/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class BT {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ilk koku girin: ");

        int x = myObj.nextInt();
        
        BianeryTree tree = new BianeryTree();
        
        tree.kok = new dugum(x);
        int k = 1;
        
        while(k != 0){
            System.out.println("""

                                ==============================
                               1-Kok Ekle
                               2-Sagina Ekle
                               3-Soluna Ekle
                               4-Sil
                               5-Yazdir
                               6-Cikis
                                ==============================

                               Yapmak istediginiz islemi secin: """);

            int i = myObj.nextInt();



                switch (i) {
                    case 1 -> {
                        System.out.println("\nKok Hangi Degerde Eklenecek:");
                        int a = myObj.nextInt();
                        System.out.println("\nEklenecek Degeri Girin:");
                        int ad = myObj.nextInt();
                        tree.kokekle(tree.kok, ad, a);
                    }
                    case 2 -> {
                        System.out.println("\nHangi Dala Ekleneceğini Secin:");
                        int b = myObj.nextInt();
                        System.out.println("\nEklenecek Degeri Girin:");
                        int bd = myObj.nextInt();
                        tree.sagaEkle(tree.kok, bd, b);
                    }
                    case 3 -> {
                        System.out.println("\nHangi Dala Ekleneceğini Secin:");
                        int c = myObj.nextInt();
                        System.out.println("\nEklenecek Degeri Girin:");
                        int cd = myObj.nextInt();
                        tree.solaEkle(tree.kok, cd, c);
                    }
                    case 4 -> {
                        System.out.println("\nSilinecek dalı secin: ");
                        int d = myObj.nextInt();
                        tree.kok=tree.sil(tree.kok, d);
                       
                    }
                    case 5 -> tree.yazdır(tree.kok);
                    case 6 -> k = 0;

            }
        }
        
    
    }
    
}
