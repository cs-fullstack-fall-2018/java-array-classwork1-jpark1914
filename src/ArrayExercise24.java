import java.util.ArrayList;

public class ArrayExercise24 {

    public static void main(String[] args){
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(5);
        numberList.add(3);
        numberList.add(7);
        System.out.println(numberList);

        System.out.println(numberList.get(1));
        numberList.remove(2);
        System.out.println(numberList.get(1));

        System.out.println(numberList);
    }
}
