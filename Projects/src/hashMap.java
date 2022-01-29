import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.*;
import java.util.HashMap;

public class hashMap {
	HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
	
	//set of keys
	Set<Integer> set = table.keySet();
	//Set<Map.Entry<Integer, Integer>> values = table.entrySet();
	
	int[] array = {1,2,3,4,5,6,57,57};
	int sum = 7;
	int num = 0;
	int num2 = 0;
	int target2;
	
	public static void main(String[] args) {
			hashMap jared = new hashMap();
			jared.calculate();
		}

	public void calculate() {
		
			for(int i = 0; i < array.length; i++) {
				if(table.containsValue(sum - array[i])) {
					num = array[i];
					for(Integer key : set) {
						int value = table.get(key);
						if(value == (sum-array[i])) {
							System.out.println(value + " + " + num + " = " + sum);
						}
					}
					break;
				}else {
					table.put(i, array[i]);
					}
		}
	System.out.println("Set: " + set);
	}
	
	private static String get(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "HashMap: \n" + table;
	}
}
