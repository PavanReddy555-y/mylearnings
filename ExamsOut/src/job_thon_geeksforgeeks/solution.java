package job_thon_geeksforgeeks;

public class solution {
static long findGoodPairs(int a[], int n, int k){
        
        // Code your solution here.
       int pr =0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1;j<a.length; j++)
                {
                    
                   if(a[i]==a[j] )
                    {
                        if(j-i>=k)
                        {
                            pr++;
                        }
                        
                    }
                }
        }
        
        return pr;
    }
/*
     static long findGoodPairs(int a[], int n, int k){
        Map<Integer, List<Integer>> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!hm.containsKey(a[i])){
                hm.put(a[i], new ArrayList<>());
            }
            hm.get(a[i]).add(i);
        }
        long count = 0;
        for(Map.Entry<Integer, List<Integer>> e : hm.entrySet()){
            List<Integer> list = e.getValue();
            for(int i = 0; i < list.size(); i++){
                int ind = find(list, i + 1, list.size() - 1, list.get(i) + k);
                if(ind != -1)
                    count += list.size() - ind;
            }
        }
        return count;
    }
    static int find(List<Integer> list, int low, int high, int x){
        while(low <= high){
            int mid = (low + high) / 2;
            if(list.get(mid) >= x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        if(low == list.size())
            low = -1;
        return low;
    }

 */

}
