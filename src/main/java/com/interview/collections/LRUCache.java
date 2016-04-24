package com.interview.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Jerry on 4/24/16.
 */
public class LRUCache<K, V> {

    private static final float hashTableLoadFactor = 0.75f;
    private LinkedHashMap<K, V> map;
    private int cacheSize;

    /**
     * 创建一个LRU Cache, 在该方法中,new LinkedHashMap<K, V>(hashTableCapacity,
     * hashTableLoadFactor, true)中, true代表使用顺序访问
     * @param cacheSize
     */
    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
        int hashTableCapacity = (int) Math.ceil(cacheSize / hashTableLoadFactor) + 1;

        map = new LinkedHashMap<K, V>(hashTableCapacity, hashTableLoadFactor, true) {

            private static final long serialVersionUID = 1;

            protected  boolean removeEldestEntry(Map.Entry<K,V> eldest) {
                return size() > LRUCache.this.cacheSize;
            }
        };
    }

    /**
     * 从Cache中访问一个元素, 被访问的元素成为MRU(most recently used).
     * @param key
     * @return
     */
    public  synchronized V get(K key) {
        return map.get(key);
    }

    /**
     * 向Cache中添加元素, 新元素成为MRU, 如果指定key值的元素已经存在,将被替换新值,
     * 如果cache已经满了,LRU元素将会被删除
     * @param key
     * @param value
     */
    public synchronized void put(K key, V value) {
        map.put(key, value);
    }

    /**
     * 清除cache
     */
    public synchronized void clear() {
        map.clear();
    }

    /**
     * 返回cache中的元素数
     * @return
     */
    public synchronized int usedEntries() {
        return map.size();
    }

    /**
     * 返回cache中所有元素的副本
     * @return
     */
    public synchronized Collection<Map.Entry<K,V>> getAll() {
        return new ArrayList<Map.Entry<K, V>>(map.entrySet());
    }

    public static void main(String[] args) {
        LRUCache<String, String> c = new LRUCache<String, String>(3);
        c.put("1", "one"); //1
        c.put("2", "two"); //2 1
        c.put("3", "three"); // 3 2 1
        c.put("4", "four"); // 4 3 2
        if (c.get("2") == null) throw new Error(); //2 4 3
        c.put("5", "five"); // 5 2 4
        c.put("4", "second four"); // 4 5 2

        if (c.usedEntries() != 3) throw new Error();
        if (!c.get("4").equals("second four")) throw new Error();
        if (!c.get("5").equals("five")) throw new Error();
        if (!c.get("2").equals("two")) throw new Error();

        for (Map.Entry<String, String> e: c.getAll())
            System.out.println(e.getKey() + " : " + e.getValue());
    }
}
