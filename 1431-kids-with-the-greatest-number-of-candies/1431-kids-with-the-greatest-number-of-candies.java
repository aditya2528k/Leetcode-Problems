class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maximum = max(candies);
        for(int i = 0; i < candies.length; i++){
           int can = candies[i] + extraCandies;
           if(can >= maximum){
            result.add(true);
           }
           else{
            result.add(false);
           }
        }
        return result;
    }    
    public int max(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max; 
    }
}