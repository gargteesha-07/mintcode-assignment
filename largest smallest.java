public class smallestlargest {
    public static int findLargest(int[] arr){
        int largest = arr[0];
        for(int num : arr){
            if(num>largest){
                largest=num;
            }
        }
        return largest;
    }
    public static int findSmallest(int [] arr){
        int smallest = arr[0];
        for(int num: arr){
            if(num<smallest){
                smallest=num;
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] array ={10,25,5,17,40,2};

        int largest = findLargest(array);
        int smallest = findSmallest(array);

        System.out.println("Largest: " +largest);
        System.out.println("Smallest: " +smallest);
    }
}
