package Giris;
import java.util.Scanner;
import java.util.Arrays;
public class diziSiralama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int dizi;
        System.out.print("Dizinin kaç elemalı olmasını istersiniz ? ");
        dizi=inp.nextInt();
        int [] list =new int[dizi];


        for(int i=0; i<dizi;i++){

            System.out.print(i+ ". elemanını giriniz : ");
            list[i]=inp.nextInt();

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
