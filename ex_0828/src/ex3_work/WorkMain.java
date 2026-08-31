package ex3_work;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class WorkMain {
    public static void main(String[] args) {
        
        // 1~45사이의 중복되지 않는 난수 6개를 출력하는
        // 로또번호 생성기 만들기
        //---------------------
        //set : 중복값을 허용하지 않는 자바의 interface
        //treeSet: 오름차순 정렬
         Set<Integer> set = new TreeSet<Integer>();
        // List<Integer> list = new ArrayList<>();


        Random rd = new Random();

         while (set.size() < 6) {
            // while (list.size() < 6) {
            int num = rd.nextInt(45) + 1;

             set.add(num);
            // list.add(num);
        
        
        }
 System.out.println("로또번호 생성"+set);
        // System.out.println("로또번호 생성" + list);

        //set에 담긴 내용을 정수배열에 복사
        Integer[] arr =  set.toArray(new Integer[0]);

        for(int n : arr ){
            System.out.print(n+ " ");

        }
    }
}
