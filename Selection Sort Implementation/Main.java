import java.util.ArrayList;
/*
Code sorts a given arraylist from least to greatest, does this by creating a new arraylist and adding
the minimum values into it until the old array is empty
Alexander Lumala 11/28/24
 */
public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> oldArray = new ArrayList<>();
        oldArray.add(7);
        oldArray.add(4);
        oldArray.add(6);
        oldArray.add(3);
        oldArray.add(2);
        oldArray.add(5);
        int currentMinumum;
        int currentItem;
        int minIndex;

        ArrayList<Integer> newArray = new ArrayList<>();
        while (!oldArray.isEmpty()){
            currentMinumum = oldArray.get(0);
            minIndex = 0;
            for (int i = 0; i < oldArray.size(); i++){
                currentItem = oldArray.get(i);
                if (currentItem < currentMinumum){
                    currentMinumum = currentItem;
                    minIndex = i;
                }
            }
            newArray.add(currentMinumum); // Add the smallest element to newArray
            oldArray.remove(minIndex);
        }
        System.out.println(newArray);
    }
}