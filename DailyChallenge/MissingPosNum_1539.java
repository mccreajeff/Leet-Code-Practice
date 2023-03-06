class MissingPosNum_1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println("Should return 9");
        System.out.println("Actual Return: " + missingNum(arr, k));
    }

    public static int missingNum(int[] arr, int k) {
        int count = 0;
        int index = 0;
        for(int i = 1; i < 1000; i++) {
            if(i < arr[index]) {
                count++;
                if(count == k) {
                    return i;
                }
            } else if(i == arr[index]) {
                index++;
                if(index == arr.length) {
                    return i + (k - count);
                }
            }
        }
        return 1000 + (k - count);
    }
}