class MyHashMap {
    int[] HashMapArray= new int[1000001];;
    public MyHashMap() {
        Arrays.fill(HashMapArray, -1); 
    }
    
    public void put(int key, int value) {
       HashMapArray[key]=value; 
    }
    
    public int get(int key) {
        return HashMapArray[key];
    }
    
    public void remove(int key) {
       HashMapArray[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */