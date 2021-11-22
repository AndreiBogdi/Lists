import java.util.ArrayList;
import java.util.List;

public class Lab6 {
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        LogicalOperations op = new LogicalOperations();
        List<Integer> mySecondList = op.getPopulatedList(100);
        System.out.println(mySecondList);

        System.out.println("Exercitiul 4:");
        List<Integer> myBackwardsList = op.PopulatedListBackwards(100);
        System.out.println(myBackwardsList);
    }
}
