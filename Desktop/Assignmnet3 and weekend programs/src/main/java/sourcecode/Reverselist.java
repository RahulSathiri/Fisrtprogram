package sourcecode;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Reverselist {
	public static void main(String[] args){
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(5);
		ls.add(9);
		ls.add(4);
		ls.add(2);
		ls.add(6);
		ls.add(3);
		System.out.println(ls);
		//ListIterator<E>ls();
		//ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("size of the list is:"+ls.size());
		//int n=ls.size();
		//ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=ls.size()-1;i>=0;i--)
		{
		int n1=ls.get(i);
		System.out.print(n1+"  ");
		}
		
//		}

	//private static char[] ls(int i,int n) {
		//char[][] ls = null;
		// TODO Auto-generated method stub
		//for(int i1=1;i1<n;i1++){

		//return ls[i1];
	}

	private static void ls() {
		// TODO Auto-generated method stub
		
	}

}
