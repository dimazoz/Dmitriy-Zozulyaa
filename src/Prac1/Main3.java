package Prac1;
import java.util.Random;
import java.util.Scanner;
public class Main3 {
        public static void main(String[] args) {
            System.out.println("Сгенерировать массив целых чисел случайным образом ,вывести его на экран,отсортировать его,и снова вывести на экран.");
            System.out.println("Введите количество элементов массива");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            Random m = new Random();
            int mas[]= new int[n];
            System.out.println("Случайный массив=");
            for (int i=0;i<10;i++){
                mas[i]=m.nextInt(100);
                System.out.println( mas[i]);
            }
        }
    }

