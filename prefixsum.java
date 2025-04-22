public class PrefixSum {
public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] prefixSum = new int[array.length];
prefixSum[0] = array[0];
 for (int i = 1; i < array.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }
  System.out.print("Prefix Sum: [");
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i]);
            if (i < prefixSum.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
Output:
Prefix Sum: [1, 3, 6, 10]

