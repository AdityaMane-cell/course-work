class IntList {
    int first;
    IntList rest;
    
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    } 
    
    public int size() {
        if(rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }
    
    public int iterativeSize() {
        IntList p = this;
        int size = 1;
        while(p.rest != null) {
            size++;
            p = p.rest;
        }
        return size;
    }
    
    public int get(int i) {
        if(i == 0) {
            return first;
        }
        return this.rest.get(i - 1);
    }
    
    /* return identical IntList with all values incremented by x .. do not change */
    public static IntList incrList(IntList l, int x) {
        IntList marker = l;
        IntList nl = new IntList(-1, null);
        IntList temp = nl;
        int n = l.size();
        
        for(int i=0; i<n; i++) {
            temp.rest = new IntList(marker.first + x, null);
            marker = marker.rest;
            temp = temp.rest;
        }
        return nl.rest;
    }
    
    /* return identical IntList with all values incrementd by x .. save to memory */
    public static IntList dincrList(IntList l, int x) {
        IntList m = l;
        int n = l.size();
        for(int i=0; i<n; i++) {
            m.first = m.first + x;
            m = m.rest;
        }
        return l;
    }
    
    public static void print(IntList l) {
        int n = l.size();
        IntList m = l;
        System.out.println("Printing list: ");
        for(int i=0; i<n; i++) {
            System.out.println(m.first);
            m = m.rest;
        }
    }
    
    public static void main(String[] args) {
        IntList l = new IntList(15, null);
        l = new IntList(10, l);
        l = new IntList(5, l);
        
        System.out.println("Size: " + l.size());
        System.out.println("Iteration Size: " + l.iterativeSize());
        System.out.println("I'th element: " + l.get(1));
        
        IntList nl = incrList(l, 3);
        print(nl);
        
        dincrList(l, 3);
        print(l);
    }
}