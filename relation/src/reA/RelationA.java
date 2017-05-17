package reA;

import reB.RelationB;

public class RelationA {
	public static void main(String[] args) {
		int[] intList; //array variable ---> reference
		intList = new int[10]; //size decide
		intList[0] = 10;
		intList[1] = 20; //...and more

		RelationB[] bList;
		bList = new RelationB[10];
		bList[0] = new RelationB();
	}
}
