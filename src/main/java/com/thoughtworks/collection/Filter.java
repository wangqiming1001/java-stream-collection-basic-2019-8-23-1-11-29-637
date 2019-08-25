package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
    	//求数组中的偶数
    	List<Integer> result = new ArrayList<Integer>(); 
    	for (int i = 0; i < array.size(); i++) {
			if (array.get(i) % 2 == 0) {
				result.add(array.get(i));
			}
		}
        return result;
    }

    public List<Integer> filterMultipleOfThree() {
    	//求数组中3的倍数
    	List<Integer> result = new ArrayList<Integer>(); 
    	for (int i = 0; i < array.size(); i++) {
			if (array.get(i) % 3 == 0) {
				result.add(array.get(i));
			}
		}
        return result;
    }
}
