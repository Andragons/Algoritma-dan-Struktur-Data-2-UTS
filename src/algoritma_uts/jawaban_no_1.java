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
public class jawaban_no_1 {

    public static void bubbleSort(int[] A){
    int i = 1, j, n = A.length;
        int temp;
        while(i < n){
            j = n - 1;
            while(j >= i){
                if(A[j - 1] > A[j]){
                    temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
                j = j - 1;
            }
                i = i + 1;
        }
    }
    
   public static void tampil(int data[]){
       for (int i = 0; i < data.length; i++) {
           System.out.print(data[i] + " ");
       }
       System.out.println();
   }
   
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int[] A = {3,10,4,2,8,13};
        int cari = 8;
        int LastIndex = A.length - 1;
        int FirstIndex = 0;
        int flag = 0;
        int point = 0;
        
   
        jawaban_no_1.tampil(A);
        
      
        jawaban_no_1.bubbleSort(A);
        jawaban_no_1.tampil(A);
        
     
                
        while((FirstIndex <= LastIndex) && (flag == 0)){
            point = (LastIndex + FirstIndex) / 2;
            System.out.println("Index point : "+ point);
            
            if(A[point] == cari){
                flag += 1;
                System.out.println("Data "+cari+" telah ditemukan pada index ke - "+ point);
            }
            
            else if(cari < A[point]){
                    System.out.println("Cari di Kiri");
                    LastIndex = point - 1;
         
            }
            else {
                    System.out.println("Cari di kanan");
                    FirstIndex = point + 1;
   
                }
               
            }
        
         if(flag == 1){
            System.out.println("Data "+cari+" telah ditemukan pada index ke "+ point + " baris ke "+ (point + 1));
             System.out.println("Kesimpulan : data ditemukan");
        } else {
            System.out.println("Kesimpulan : data tidak ditemukan");
     
        }
         System.out.println("");
        System.out.println("Ramanda Kholisandra");
        
        }
    }       
