package PracticaNS.PracticaNS_001;



import static org.junit.Assert.*;
import static org.testng.Assert.assertNotSame;
import org.junit.Test;
import Methods.ArrayMethod;

public class SortValues{
	

	ArrayMethod am = new ArrayMethod();
	int [] values = {15,25,0,16};
	
@Test
     public void succesfulPath(){		
		int[] sortedValues;
		int[] expectedSort = {0,15,16,25};
		sortedValues = (int[]) am.array(values);		
		assertArrayEquals(expectedSort, sortedValues);
	}
@Test
	public void notSortedArray(){
		int[] sortedValues;
		int[] expectedSort = {15,0,25,16};
		sortedValues = (int[]) am.array(values);
		assertNotSame(expectedSort, sortedValues);
}
@Test
	public void dferentArray(){
		int[] sortedValues;
		int[] expectedSort = {0,15,16,26};
		sortedValues = (int[]) am.array(values);
		assertNotSame(expectedSort, sortedValues);
}

}
