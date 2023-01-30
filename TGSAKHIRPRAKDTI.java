/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsakhirprakdti;

/**
 *
 * @author ASUS TUF
 */
public class TGSAKHIRPRAKDTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=5;
        for (int i=1; i<=a; i++){
            for(int j=1; j<=a; j++)
             if(i==1||j==1||i==a||j==a)   
                 System.out.print("* ");
             else 
                 System.out.print("  ");
            for(int j=1; j<=a; j++)
             {
             if(i==2&&j>2)
                    System.out.print("  ");
             else if (j==1||j==a||i==1||i==a||i==3)
                 System.out.print("* ");
             else 
                 System.out.print("  ");
                    }
            for(int j=1; j<=9; j++)
             {
                 if (i==j||i+j==10)
                 System.out.print("*");
             else
                 System.out.print(" ");
             }   
            System.out.println();
        }
    }
    
}
