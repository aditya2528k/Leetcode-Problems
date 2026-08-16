class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int floor = 0;
        int time  = 0;

        for(int i = 0; i < requests.length; i++){
            time += Math.abs(floor - requests[i]);
            floor = requests[i];
        }
        return time;
    }
}