class OrderedStream {
    private String[] arr;
    private int idx = 0;
    
    public OrderedStream(int n) {
        this.arr = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        arr[idKey - 1] = value;
        List<String> currList = new ArrayList<>();
        while(idx < arr.length && arr[idx] != null) {
            currList.add(arr[idx]);
            idx++;
        }
        return currList;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */