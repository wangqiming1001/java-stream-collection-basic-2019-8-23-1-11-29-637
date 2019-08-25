package com.thoughtworks.collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> sortFromBig() {
    	//从大到小排序
    //	List<Integer> result = new ArrayList<Integer>();
    	for (int i = 0; i < array.size() - 1; i++) {  
            for (int j = 1; j < array.size() - i; j++) {  
                Integer a;  
                // 比较两个整数的大小  
                if ((array.get(j - 1)).compareTo(array.get(j)) < 0) {
                    a = array.get(j - 1);  
                    array.set((j - 1), array.get(j));  
                    array.set(j, a);  
                }  
            }  
        }  
       return array;
    }

    public List<Integer> sortFromSmall() {
    	//从小到大排序
    	for (int i = 0; i < array.size() - 1; i++) {  
            for (int j = 1; j < array.size() - i; j++) {  
                Integer a; 
                // 比较两个整数的大小  
                if ((array.get(j - 1)).compareTo(array.get(j)) > 0) {  
                    a = array.get(j - 1);  
                    array.set((j - 1), array.get(j));  
                    array.set(j, a);  
                }  
            }  
        }  
       return array;
    }
}
