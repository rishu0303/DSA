class RandomizedSet {
    HashSet<Integer> set;
    public RandomizedSet() {
       set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(set.contains(val))   return false;
        set.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!set.contains(val))   return false;
        set.remove(val);
        return true;
    }
    
    public int getRandom() {
        if(set.size()==0)   return -1;
        // Iterator<Integer> iterator = set.iterator();
        Random rand = new Random();
        int randomIndex = rand.nextInt(set.size());
        Object[] array = set.toArray();
        return (int)array[randomIndex];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */