package datastructure.hash;

public class BasicHashMap<K, V> {

    // fir better re-sizing is taken as 2^4;
    final static int SIZE = 16;

    Entry[] data = new Entry[SIZE];


    /*
    If the map previously contained a mapping for the key, the old value will be replaced
     */
    public void put(K key, V value) {
        int hash = key.hashCode() / SIZE;
        System.out.println("Key :" + key + ", key.hashCode : " + key.hashCode() + ", hash : " + hash);
        Entry entry = data[hash];

        // If we insert duplicate key value pair, old value will be replaced by new one
        if (entry != null) {
            if (entry.getKey().equals(key)) {
                entry.value = value;
            } else {
                // Collision : insert new element at the end of the list in the same bucket
                Entry newEntryInOldBucket = new Entry(key, value);
                entry.next = newEntryInOldBucket;
            }

        } else {
            // create new bucket for new element in the map
            Entry newEntry = new Entry(key, value);
            data[hash] = newEntry;
        }
    }

    // Return the Entry mapped to the key in the HashMap
    public Entry get(K key) {
        int hash = key.hashCode() / SIZE;
        Entry entry = data[hash];

        //Bucket is identified by hashCode and traverse the bucket till element is not found
        while (entry != null) {
            if (entry.getKey().equals(key)) {
                return entry;
            }
            entry = entry.next;
        }
        return null;
    }

    //Return the Value mapped by the key in the HashMap
    public V getValue(K key){
        int hash  = key.hashCode() / SIZE;
        Entry entry = data[hash];

        while (entry != null){
            if(entry.getKey().equals(key)){
                return (V)entry.getValue();
            }
            entry = entry.next;
        }
        return null;
    }


    // TO store Map data in Key and Value pair
    // Used Linked list approach to avoid the collision
    class Entry<K, V> {

        private V value;
        private K key;
        private Entry next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }


}
