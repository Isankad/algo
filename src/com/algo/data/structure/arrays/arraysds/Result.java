package com.algo.data.structure.arrays.arraysds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {
	/*
	 * Complete the 'reverseArray' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static List<Integer> reverseArray(List<Integer> a) {
    	List<Integer> reverseList = new ArrayList<>(a);
    	Collections.reverse(reverseList);
        return reverseList;
    }
}
