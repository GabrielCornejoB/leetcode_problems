// https://leetcode.com/problems/product-of-array-except-self/description/

public class productOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        // Array of productos from left to right
        int leftProducts[] = new int[nums.length];
        // Array of products from right to left
        int rightProducts[] = new int[nums.length];

        int product = 1;
        // Fill the array with products from l to r
        for (int i = 0; i < leftProducts.length; i++) {
            leftProducts[i] = product *= nums[i];
        }
        product = 1;
        // Fill the array with products from r to l
        for (int i = rightProducts.length-1; i >= 0; i--) {
            rightProducts[i] = product *= nums[i];
        }
        product = 1;
        // For each number in tne input array, the product of the other numbers is equal to the product of:
        // index - 1 in the left array
        // index + 1 in the right array
        // It only calculate a side if the index is not out of bound in the array
        for (int i = 0; i < ans.length; i++) {
            if (i-1 >= 0) product *= leftProducts[i-1];
            if (i+1 < nums.length) product *= rightProducts[i+1];

            ans[i] = product;
            product = 1; 
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        for (int i : productExceptSelf(arr)) {
            System.out.println(i);
        }
    }
}

// Intento 1
// int l = 0;
// int r = 0;
// int product = 1;
// while(l < nums.length) {
//     if (r != l) product = product * nums[r];
//     r += 1;
//     if (r == nums.length){           
//         ans[l] = product;
//         l+=1;
//         product = 1;
//         r = 0;
//     }      
// }


// Intento 2
// int atras = 0;
// int adelante = nums.length-1;
// int puntero = 0;
// int producto = 1;
// while(puntero < nums.length) {
//     if (atras != puntero) {
//         producto *= nums[atras];
//         atras++;
//     }
//     if (adelante != puntero) {
//         producto *= nums[adelante];
//         adelante--;
//     }

//     if (atras == puntero && adelante == puntero) {
//         ans[puntero] = producto;
//         puntero++;
//         producto = 1;
//         atras = 0;
//         adelante = nums.length - 1;
//     }      
// }