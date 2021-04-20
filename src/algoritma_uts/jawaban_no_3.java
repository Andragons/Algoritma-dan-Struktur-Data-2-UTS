/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma_uts;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class jawaban_no_3 {
    
    public static void main(String[] args) {
        int i, j, m, n;
        int matriksA[][] = new int[10][10]; 
        int transposeA[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris matriks A: ");
        m = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A: ");
        n = scan.nextInt();
        System.out.println("Masukkan elemen matriks A: ");
        for(i = 0; i < m; i++){
            for(j = 0; j< n; j++){
                matriksA[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil matriks A: ");
        for(i = 0 ; i < m; i++){
             for(j = 0 ; j < n; j++){
                 System.out.print(matriksA[i][j] + "\t");
             }
             System.out.println("");
         }
        
        for(i = 0; i < m; i++){
            for(j = 0; j< n; j++){
                transposeA[j][i] = matriksA[i][j];
            }
        }
        System.out.println("Hasil transpose matriks A: ");
        for(i = 0; i < n; i++){
            for(j = 0; j< m; j++){
                System.out.print(transposeA[i][j] + "\t");
            }
        System.out.println();
        }
        
        int o, p, q, r;
        int matriksB[][] = new int[10][10]; 
        int transposeB[][] = new int[10][10];
    System.out.print("Masukkan jumlah baris matriks B: ");
    q = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks B: ");
    r = scan.nextInt();
    System.out.println("Masukkan elemen matriks B: ");
    for(o = 0; o < q; o++){
            for(p = 0; p < r; p++){
                matriksB[o][p] = scan.nextInt();
            }
        }
    
     System.out.println("Hasil matriks B: ");
        for(o = 0; o < q; o++){
            for(p = 0; p < r; p++){
                 System.out.print(matriksB[o][p] + "\t");
             }
             System.out.println("");
         }
        
        for(o = 0; o < q; o++){
            for(p = 0; p < r; p++){
        transposeB[p][o] = matriksB[o][p];
      }
    }
        
    System.out.println("Hasil transpose matriks B: ");
     for(o = 0; o < r; o++){
            for(p = 0; p < q; p++){
                System.out.print(transposeB[o][p] + "\t");
      }
      System.out.println();
    }
        System.out.println();
        System.out.println("Ramanda Kholisandra");
  }
}
    
