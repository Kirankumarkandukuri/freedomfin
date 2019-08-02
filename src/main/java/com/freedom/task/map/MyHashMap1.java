package com.freedom.task.map;

import com.freedom.task.map.MyHashMap.Entry;

public class MyHashMap1<K,V> {
	
	final static int INITIAL_CAPACITY=16;
	
	private Entry<K,V>[] buckets;
	
	int size=0;
			
	class Entry<K,V>
	{
		K key;
		V value;
		Entry<K,V> next;
		
		Entry(K key, V value, Entry<K,V> next)
		{
			this.key=key;
			this.value=value;
			this.next=next;
		}
		
	}
	 MyHashMap1()
	{
		this(INITIAL_CAPACITY);
	}
	 MyHashMap1(int capacity)
		{
			this.buckets = new Entry[16];
		}
	 
	 int getHashCode(K key)
	 {
		 return Math.abs(key.hashCode());
	 }

	
			  public void put(K key, V value)
			{
				int index = getHashCode(key)%buckets.length;
				Entry<K,V> bucket = buckets[index];
				if(bucket==null)
				{
					bucket = new Entry(key,value,null);
					buckets[index] = bucket;
					size++;
				}
				else {
					while(bucket!=null)
					{
						if(bucket.key.equals(key))
						{
							bucket.value=value;
							return;
						}
						bucket=bucket.next;
					}
					if(bucket.key.equals(key))
					{
						bucket.value=value;
					}
					else {
						bucket.next = new Entry(key,value,null);
						return;
						
					}
				}
				
			}
			  
			  public V get(K key)
				 {
					 Entry<K,V> entry = buckets[getHashCode(key)%buckets.length];
					 while(entry!=null)
					 {
						 if(entry.key==key)
							 return entry.value;
						 entry = entry.next;
					 }
					 return null;
				 }

}
