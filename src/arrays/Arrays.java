package arrays;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
    int[] intArray = new int[15];
    
    System.out.println(intArray[0]); 
    intArray[0] = 215;
    intArray[1] = 548;
    intArray[2] = 4547;
    intArray[3] = 458;
    System.out.println(intArray[0]); 
    System.out.println(intArray[1]); 
    int[] intArray2 = { 215, 548, 4547, 458 };
    System.out.println(intArray2[0]);
    System.out.println(intArray2[1]);
    System.out.println("Length; "+intArray2.length);
	ArrayList arrayList = new ArrayList();
	arrayList.add(125);
	arrayList.add(13);
	arrayList.add(125);
	arrayList.add(13);
	System.out.println("Size: " + arrayList.size());
	System.out.println("Get : " + arrayList.get(0));
	
	for(int i = 0; i < arrayList.size(); i++) {
		System.out.println("Loop(index " + ", Value: "+ arrayList.get(i) + ")");
	}
	for(int i = 0; i < arrayList.size(); i++) {
		System.out.println("Loop(index " + ", Value: "+ intArray[i] + ")");
		
	}

	}
}
	
