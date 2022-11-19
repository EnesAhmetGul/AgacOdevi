/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 *
 * @author Lenovo
 */
public class BianeryTree {
    public dugum kok;

  public void yazdır(dugum nod) {
    if (nod != null) {
      yazdır(nod.sol);
      System.out.print(nod.deger + " ");
      yazdır(nod.sag);
    }
  }
  
    dugum sil(dugum kok,int data){
         if(kok==null){
             return kok;
         } 
         else if(kok.deger==data){
           kok.sol=null;
           kok.sag=null;
           kok.sag=sil(kok.sag,data);
           kok.sol=sil(kok.sol, data);
           kok=null;
         }
         else{
           kok.sag=sil(kok.sag,data);
           kok.sol=sil(kok.sol, data);
         }
           return kok;
    }
  
//  public void kokEkle(dugum nod, int sayi, int index){
//        if (nod != null) {
//            if (nod.sol != null && nod.sol.deger == index) {
//                System.out.print("Calisiyor");
//                dugum budugum = new dugum(sayi);
//                nod.sol.sol = budugum.sol;
//                nod.sol = budugum;
//            }
//            if (nod.sag != null && nod.sag.deger == index) {
//                System.out.print("Calisiyor");
//                dugum budugum = new dugum(sayi);
//                nod.sag.sag = budugum.sol;
//                nod.sag= budugum;
//            }
//            kokEkle(nod.sol, sayi, index);
//            kokEkle(nod.sag, sayi, index);
//        }
//  }
  
  dugum kokekle(dugum root,int data,int aranan){
        dugum gecici;
        if(root != null){
            if(root.sol != null){
                if(root.sol.deger == aranan){
                    gecici = root.sol;
                    dugum dugum = new dugum(data);
                    root.sol = dugum;
                    root.sol.sol = gecici;
                }
                else {
                    root.sag = kokekle(root.sag, data, aranan);
                    root.sol = kokekle(root.sol, data, aranan);

                }
            }
            if(root.sag != null){
                if(root.sag.deger == aranan){
                    gecici = root.sag;
                    dugum dugum = new dugum(data);
                    root.sag = dugum;
                    root.sag.sag = gecici;
                }
                else {
                    root.sol = kokekle(root.sol, data, aranan);
                    root.sag = kokekle(root.sag, data, aranan); 
                }
            }  
        }
        return root;    
    }
  
  
  public void sagaEkle(dugum nod, int sayi, int index){
      if (nod != null) {
          
            if (nod.deger == index) {
                if(nod.sag != null){
                    System.out.print("Sagi Zaten Dolu!\n");
                }
                else {
                    nod.sag = new dugum(sayi);
                }
            
            }
            sagaEkle(nod.sol, sayi, index);
            sagaEkle(nod.sag, sayi, index);
        }
  }
  
  public void solaEkle(dugum nod, int sayi, int index){
      if (nod != null) {
            if (nod.deger == index) {
                if(nod.sol != null){
                    System.out.print("Solu Zaten Dolu!\n");
                }
                else {
                    nod.sol = new dugum(sayi);
                }
            }
            solaEkle(nod.sol, sayi, index);
            solaEkle(nod.sag, sayi, index);
        }
  }
  
  public dugum sonsil(dugum nod, int aranan){
      if(nod == null){
        return nod;
    }
    if(nod.sol != null){
        if(nod.sol.deger == aranan){
        nod.sol = null;
        nod = null;
        }
    }
    if(nod.sag != null){
        if(nod.sag.deger == aranan){
        nod.sag = null;
        nod = null;
       }
    }
    

    sonsil(nod.sol, aranan);
    sonsil(nod.sag, aranan);
        
    
    return nod;
    }
      
  }