class minCostClimbingStairs {
    //Dynamic Programming 

    public int minCostClimbingStairs(int[] cost) {
        
        int temp = 0;
        int p = 0; //set p = 0 to know if we should start as index 0 / 1;
        int np = 0;
        
        for(int i = 0; i < cost.length; i++){
            temp = p;
            p = cost[i] + min(p, np);
            np = temp;
        }
        return min(p, np);
    }
    
    public int min(int a, int b){
        if(a < b){
            return a;
        }
        return b;
    }

    
}