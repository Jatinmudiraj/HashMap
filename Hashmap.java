package hashmap;

import java.util.*;
import java.util.Map.Entry;
import java.util.Map;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> numbers = new HashMap<>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("five", 5);
		numbers.putIfAbsent("three", 4);
		System.out.println(numbers.get("three"));
		System.out.println(numbers.containsKey("three"));
		System.out.println(numbers.containsValue("4"));
		System.out.println(numbers.entrySet());
		Set<Entry<String, Integer>> entries = numbers.entrySet();
		for(Entry<String, Integer> entry: entries) {
			entry.setValue(entry.getValue() *100 );
		}
		System.out.println(numbers);
		System.out.println(getHash("CAT"));
	}
	public static int getHash(String s) {
		int hash=0;
		for(int i =0; i<s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}
}
/* Methods of Maps:-
 * put(k,v)- Inserts the association of key k and a value v into the map. If the key is already present, the new value replaces the old value.
 * putAll()- Insert all the entries from the specified map to this map.
 * putIfAbsent(k,v)-Inserts the association if the key k is not already associated with the value v.
 * get(k)-Returns the value associated with the specified key k. If the key is not found it returns null.
 * getOrDefault(k,defaultValue)- return the value assoicated with the specified key k, If the Key is not found, it returns the defaultValue.
 * containsKey(k)- Checks if the specified key k is present in the map or not.
 * containsValue(v)- Checks if the specified value v s present in the map or not.
 * replace(k,v)-Replace the value of the key k with the new specified value v.
 * replace(k,oldValue,newValue)- Replaces the value of the key K with the new value only if the key Kis associated with the value oldValue.
 * remove(k)- Removes the entry from the map represented by the key k.
 * remove(k,v)- Remove the entry from th emap that has key K associated with value v.
 * keySet()- Returns a set of all the keys present in a map.
 * value()- Returns a set of all the values present in a map.
 * entrySet()- Returns a set of all the key/value mapping presents in a map.*/
