class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int sum = asteroid + stack.peek();
                if (sum < 0) {
                    stack.pop();
                } else if (sum > 0) {
                    asteroid = 0;
                } else {
                    stack.pop();
                    asteroid = 0;
                }
            }
            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }
}