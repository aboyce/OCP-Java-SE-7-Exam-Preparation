package ocp.generics_and_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class UsingCollections {
	
	public static void main(String[] args) {
		usingCollections();
	}
	
	private static void usingCollections() {
		
		/* LISTS - we all know a list. */
		List<String> arraryList = new ArrayList<String>();
		arraryList.add("This is number zero");
		arraryList.remove(0);
		
		List<String> vector = new Vector<String>();
		vector.add("This is threaded, but a little slower.");
		vector.remove(0);
		
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("They are all linked.");
		linkedList.add("Linking, linking. Quick if you are adding elements to the end.");
		linkedList.add(1, "Still has all the good List methods obviously.");
		
		/* SETS - They don't allow duplicates */
		Set<String> hashSet = new HashSet<String>();
		String testString = new String("Cannot have duplicates.");
		hashSet.add(testString);
		hashSet.add("Cannot have duplicates."); // This is false.
		hashSet.add(testString); // This is false.
		hashSet.add("Fast access, and no ordering");

		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Still no duplicates.");
		linkedHashSet.add("Iterates by insertion order (They are linked!).");
		linkedHashSet.remove("Can remove objects, although this will be false");
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Still no duplicates here, it's still a set.");
		treeSet.add("'Tree' adds some sorting functionality.");
		
		/* MAPS, mapping a Key to a Value. (C# Dictionary) */
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "The first one");
		String theFirst = hashMap.get(0);
		hashMap.remove(0);
		hashMap.put(0, "Fast updates, but only one null key");
		hashMap.put(1, "Dont forget that keys should have good hashing and equals implementations.");
		// The better the hash, the more efficient it is.
		
		Map<Integer, String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(0, "Slower HashMap");
		hashTable.put(1, "Like 'Vector', it's because its threaded.");
		hashTable.put(2, "With the old, its strict. No nulls whatsoever");
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(0,"Fast iterations, it's all that linking I tell you.");
		linkedHashMap.put(1, "Iterates by insertion order, or last accessed");
		linkedHashMap.put(99, "Like the classic, HashMap, only one null key, any null values.");
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(0, "Like all these 'tree' equivalents, it's the sorted version.");
		treeMap.clear(); // This will wipe the lot.
		treeMap.containsKey(0); // Check for keys.
		treeMap.containsValue("Can also see if the value is there");
		
		/* QUEUE */
		Queue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("Something to put on the queue");
		priorityQueue.offer("This is also the same as add(), from different interfaces.");
		priorityQueue.peek(); // Has a cheeky look if there is anything there.
		priorityQueue.poll(); // Actually grabs something off the queue.
		
		
		
	}

}
