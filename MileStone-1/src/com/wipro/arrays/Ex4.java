package com.wipro.arrays;

public class Ex4 {
	public static void main(String args[])
	{
		int num[] = {65, 123, 34, 75, 54,115,98,78,64,45};
        String str =null;
        for(int i=0;i<num.length;i++){
            str = Character.toString((char)num[i]);
            System.out.println(str);
	}
	}

}
