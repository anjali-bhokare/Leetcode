class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> num = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < temp.length; i++) {
            if (!num.containsKey(temp[i])) {
                num.put(temp[i], rank++);
            }
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = num.get(arr[j]);
        }
        return arr;
    }
}