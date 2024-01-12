package collections;

public class DeleteArrayElement {
    public static void main(String[] args){
        int[] originalArray = {1,2,3,4,5,6,7,8,9};
        int elementToDelete = 3;
        int[] newarr;
        int indexToDelete = -1;
        for(int i = 0; i< originalArray.length; i++){
            if (originalArray[i] == elementToDelete) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete != -1) {
            int[] newArray = new int[originalArray.length - 1];

            // Copy elements before the deleted element
            System.arraycopy(originalArray, 0, newArray, 0, indexToDelete);

            // Copy elements after the deleted element
            System.arraycopy(originalArray, indexToDelete + 1, newArray, indexToDelete, newArray.length - indexToDelete);

            // Print the new array
            System.out.println("Array after deleting the element:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    }

