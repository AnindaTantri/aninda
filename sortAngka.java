/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class sortAngka {
    public static void main(String[] args) {
        int[] angka = {101, -77, 23, 1209, -41, 0, 117};
        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 0; j < angka.length - i - 1; j++) {
                //compare int
                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + ",");
        }
    }
}
