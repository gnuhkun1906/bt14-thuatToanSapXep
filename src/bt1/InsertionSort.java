package bt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử muốn thêm");
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            list.add(new Random().nextInt(20));
        }
        System.out.println("Show list");
        System.out.println(list);
        insertSort(list);
    }
    public static void insertSort(List<Integer> list){
        for (int i = 1; i < list.size() ; i++) {
            System.out.println("vòng lặp thứ "+i);
            for (int j = i-1; j >=0 ; j--) {
                System.out.println("vòng lặp thứ "+i+"."+j);
                if (list.get(j+1)< list.get(j)){
                    System.out.println(list.get(j+1)+"<"+ list.get(j));
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set((j+1), temp);
                }
            }
            System.out.println(list);
        }
        System.out.println(list);
    }
}
