package com.freedom.task.map;

public class MyHashMap<K,V> {
	
	private static final int INITIAL_CAPACITY=16;
	private Entry<K,V>[] buckets;
	 private int size = 0;
	
	class Entry<K,V>{
		
		final K key;
		V value;
		Entry<K, V> next;
		
		public Entry(K key, V value, Entry<K, V> next) {
	        this.key = key;
	        this.value = value;
	        this.next=next;
	        
	    }
		
	}
	public MyHashMap()
	{
		this(INITIAL_CAPACITY);
		
	}
	
	public MyHashMap(int capacity)
	{
		this.buckets= new Entry[capacity];
	}
	
	 public void put(K key, V value) {
		 Entry<K,V> entry = new Entry(key,value,null);
		 int bucket = getHash(key)%getBucketSize();
		 Entry<K,V> existingBucket = buckets[bucket];
		 if(existingBucket ==null)
		 {
			 buckets[bucket] = entry;
			 size++;
		 }
		 else {
			 while(existingBucket.next!=null)
			 {
				 if(existingBucket.key.equals(key))
				 {
					 existingBucket.value=value;
					 return;
				 }
				 existingBucket = existingBucket.next;
			 }
			  if (existingBucket.key.equals(key)) {
				  existingBucket.value = value;
	            } else {
	            	existingBucket.next = entry;
	                size++;
	            }
		 }
		 
	 }
	 
	 public V get(K key)
	 {
		 Entry<K,V> entry = buckets[getHash(key)%getBucketSize()];
		 while(entry!=null)
		 {
			 if(entry.key==key)
				 return entry.value;
			 entry = entry.next;
		 }
		 return null;
	 }
	 
	  private int getHash(K key) {
	        return key == null ? 0 : Math.abs(key.hashCode());
	    }
	
	  private int getBucketSize() {
	        return buckets.length;
	    }
	

}
