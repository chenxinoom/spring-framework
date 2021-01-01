package org.springframework.chenoom.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		System.out.println("11");
//		Arrays.sort();


	}

	public List<String> generateParenthesis(int n) {

		List<String> jg = new ArrayList();
		//递归
		if(n == 1){
			jg.add("()");
			return jg;
		}
		List<String> list = generateParenthesis(n - 1);
		for(int i = 0; i < list.size() ; i++){
			//左右
			if(i == 0) jg.add("()" + list.get(i));
			else {
				jg.add("()" + list.get(i));
				jg.add(list.get(i) + "()");
			}
			//内外
			jg.add("(" + list.get(i) + ")");
		}

		return jg;


	}
}
