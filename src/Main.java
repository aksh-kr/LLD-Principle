package src;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,4,5,0,0,0};
        int[] arr2 = {2,3,4};
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        int end1 = arr1.length-1;
        int i=2;
        int j=2;
        while(i>=0 && j>=0) {
            if(arr1[i] >= arr2[j]) {
                arr1[end1] = arr1[i];
                i--;
            }else {
                arr1[end1] = arr2[j];
                j--;
            }
            end1--;
        }
    }
}