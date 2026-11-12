class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        // Initialize the result array. Java automatically fills it with 0s,
        // which handles days that never get a warmer temperature.
        int[] answer = new int[n];
        
        // Use a Deque as a stack (faster than the legacy Stack class).
        // This stack stores the INDICES of days waiting for a warmer temperature.
        Deque<Integer> stack = new ArrayDeque<>();

        for (int currentDay = 0; currentDay < n; currentDay++) {
            int currentTemp = temperatures[currentDay];

            // While the stack is not empty AND today is warmer than the day 
            // at the top of the stack, we found the warmer day it was waiting for.
            while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
                // Remove that previous cooler day from the stack
                int prevDay = stack.pop();
                
                // Calculate how many days passed between prevDay and currentDay
                answer[prevDay] = currentDay - prevDay;
            }

            // Push today's index onto the stack so it can wait for its own warmer day
            stack.push(currentDay);
        }

        return answer;
    }
}
