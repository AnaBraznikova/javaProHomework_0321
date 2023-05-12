package telran.homework2103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyAppCompare {
    public static void main(String[] args) {

     List<MyEq> myEqList = new ArrayList<>();
        myEqList.add(new MyEq("abc","last"));
        myEqList.add(new MyEq("pklz", "yelp"));
        myEqList.add(new MyEq("rpng", "note"));
        myEqList.add(new MyEq("ppza", "xyz"));

//        System.out.println(myEqList);
//        System.out.println();
//        SortByName sortByName = new SortByName();
//        Collections.sort(myEqList, sortByName);
//        System.out.println(myEqList);


//        написать через массив, а не через collections
        myEqList.sort(new SortByName());
        System.out.println(myEqList);





    }
}
