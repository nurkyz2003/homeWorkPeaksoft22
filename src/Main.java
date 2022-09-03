import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList <Integer> array = new ArrayList<>(50);
        ArrayList <Integer> arrayEvenNumbers = new ArrayList<>();
        ArrayList <Integer> arrayOddNumbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            array.add(i, random.nextInt(1, 100));
            if (array.get(i)%2==0){
                arrayEvenNumbers.add(array.get(i));
            }
            else if(array.get(i)%2==1){
                arrayOddNumbers.add(array.get(i));
            }
        }
        System.out.println("-----------------------------------------------------------------------------ALL NUMBERS--------------------------------------------------------------\n");
        System.out.println(array);
        System.out.println("---------------------------------------------------------------------------ONLY EVEN NUMBERS----------------------------------------------------------\n");
        System.out.println(arrayEvenNumbers);
        System.out.println("---------------------------------------------------------------------------ONLY ODD NUMBERS NUMBERS---------------------------------------------------\n");
        System.out.println(arrayOddNumbers);
    }

}