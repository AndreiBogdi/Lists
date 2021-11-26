import java.util.ArrayList;
import java.util.List;

public class Lab6 {
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        LogicalOperations op = new LogicalOperations();
        List<Integer> mySecondList = op.getPopulatedList(100);
        List<Integer> myBackwardsList = op.getPopulatedListBackwards(100);
        System.out.println(mySecondList);

        System.out.println("Exercitiul 3:");
        op.printListFromNumber(mySecondList, 50);

        System.out.println("Exercitiul 4:" + myBackwardsList);




    }
}
