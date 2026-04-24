class MovingAverage {
    private int size;
    private int sum;
    Queue<Integer> q ;
    public MovingAverage(int size) {
        this.size = size;
        this.q= new LinkedList<>();
        this.sum = 0;
    }
    
    public double next(int val) {
        q.offer(val);
          sum+=val;
         if(q.size()>size){
             sum-=q.poll();
         }

        return sum*1.0/q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
