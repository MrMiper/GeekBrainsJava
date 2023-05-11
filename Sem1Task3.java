//Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

class arrBubble {
    public static void main(String[] args) {
        
        int [] nums = new int[] {3, 3, 2, 2};
        int val = 3;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                for(int j = 0; j < nums.length; j++) {
                    System.out.print(nums[j]);
            }
            System.out.println();
        }

    }
}
}