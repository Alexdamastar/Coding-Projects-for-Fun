import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mainArray = new ArrayList<>();
        mainArray.add(7);
        mainArray.add(4);
        mainArray.add(6);
        mainArray.add(3);
        mainArray.add(2);
        mainArray.add(5);

        System.out.println(mergeSort(mainArray));
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> arrayList)
    {
        if (arrayList.size() == 1)
        {
            return arrayList;
        }
        int mid = arrayList.size()/2;
        ArrayList<Integer> arrayLeft = new ArrayList<>(arrayList.subList(0,mid));
        ArrayList<Integer> arrayRight = new ArrayList<>(arrayList.subList(mid,arrayList.size()));

        return merge(arrayLeft, arrayRight);
    }
    
    public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right)
    {
        ArrayList<Integer> newArray = new ArrayList<>();

        while (!left.isEmpty() && !right.isEmpty()){
            if (left.get(0) > right.get(0)){
                newArray.add(right.get(0));
                right.remove(0);
            }
            else{
                newArray.add(left.get(0));
                left.remove(0);
            }
        }

        while(!left.isEmpty()){
            newArray.add(left.get(0));
            left.remove(0);
        }

        while(!right.isEmpty()){
            newArray.add(right.get(0));
            right.remove(0);
        }
        return newArray;
    }
}
