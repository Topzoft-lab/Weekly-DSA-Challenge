public class ArrayOperation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayOperation arrayOperation = new ArrayOperation();
        int[] arr = {1, 2, 3, 4, 5};
        int pos = 2;
        int value = 10;
        
        arrayOperation.insertAndTraverse(arr, pos, value);
    
    }

    
    /**
     * Implement a method that inserts an element at any position in an array.
     * Traverse the array and print all elements.
     */
    
    public void insertAndTraverse(int[] arr, int pos, int value) {
        // Insert and Traverse logic
        int[] newArr = new int[arr.length + 1];
    
        // Copy elements before the position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
    
        // Insert the value at the position
        newArr[pos] = value;
    
        // Copy elements after the position
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
      
        // Print the array
        for (int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }       
    }

    /**
     * Write a method to delete an element from a given index.
     * Handle edge cases such as an empty array or invalid index.
     */
    
    public void deleteElement(int[] arr, int index) {
        // Deletion logic

        // Check if the array is empty
        if (index < 0 || index >= arr.length ){
            System.out.println("Invalid index or empty array");
            return;    
        }
        
        // Create a new array with one less element
        int[] newArr = new int[arr.length - 1];

        
        // Copy elements before the index
        for (int i = 0, k = 0; i < arr.length; i++){
            if (i == index){
                continue;
            }
            newArr[k++] = arr[i];
        }
    }





}