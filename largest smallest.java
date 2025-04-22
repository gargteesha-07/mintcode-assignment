public class LargestSmallest {
 public static void main(String[] args) {
        int[] array = {10, 25, 5, 17, 40, 2};
 int largest = array[0];
        int smallest = array[0];
for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
 System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
