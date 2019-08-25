package com.thoughtworks.collection;


import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
    	//求leftBorder 和rightBorder之间的偶数和
    	int sum = 0;
    	if (leftBorder < rightBorder) {
    		for(int i = leftBorder;i<=rightBorder;i++) {
    			if (i%2 == 0) {
    				sum = sum+i;
    			}
    		}
    	}else if (leftBorder > rightBorder) {
    		for(int i =rightBorder ;i<=leftBorder;i++) {
    			if (i%2 == 0) {
    				sum = sum+i;
    			}
    		}
		}else {
			return -1;
		}
    	System.out.println(sum);
    	return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
    	int sum = 0;
    	for(int i=0;i<arrayList.size();i++ ) {
    		//求数组中每个元素的3倍加2的和
    		sum += arrayList.get(i) * 3 + 2;
    	}
    	return sum;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
    	//求数组中所有偶数的平均数
    	int sum = 0;
    	int count = 0;
    	for(int i=0;i<arrayList.size();i++ ) {
    		if (arrayList.get(i)%2 == 0) {
    			count ++;
				sum += arrayList.get(i);
			}
    	}
    	double avg = sum / count;
    	return avg;
    }
}
