/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author advdi
 */
import java.util.Scanner;
public class Tugas1 {
    int[][] matriks = new int[2][2];         //pembuatan array dan menentukan panjangnya

    public static void main(String[] args) {
        Tugas1 panggil = new Tugas1();       //instantiasi objek
        
        System.out.println("Matriks 2x2");
        
        panggil.input();                     //method input matriks
        panggil.output();                    //method output matriks
    }
    
    void input() {
        Scanner ketik = new Scanner(System.in);
        
        for (int baris = 0; baris < matriks.length; baris++) {
            System.out.printf("Input baris %d : ", baris+1);
            for (int kolom = 0; kolom < matriks.length; kolom++) {
                matriks[baris][kolom] = ketik.nextInt();     //user input nilai array per baris
            }
        }
    }

    void output() {
        System.out.println("===================");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks.length; j++) {
                System.out.printf("%d ", matriks[i][j]);
            }
            System.out.println();
        }
    }
}
