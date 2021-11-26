import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class LogicalOperations {

    public List<Integer> getPopulatedList(int max){
        List<Integer> myList = new ArrayList<>();
        for(int i =1; i<= max;i++){
            myList.add(i);
        }
        return myList;
    }

    public void printListFromNumber(List<Integer> myList, int number){
        for(int i = number;i <=myList.size();i++){
            System.out.println(myList.get(i-1));
        }
    }

    public List<Integer> getPopulatedListBackwards( int max){
        List<Integer> myList = new ArrayList<>();
        for(int i=max;i>=1;i--){
            myList.add(i);
        }
        return myList;
    }

    public int getHighestNumber(List<Integer> myarrayList,int max){
        myarrayList = new ArrayList<>();
        int HighestNumber = Collections.max(myarrayList);
        for(int i = 0; i<= max;i++){
            myarrayList.add(i);
        }
        return HighestNumber;
    }


}
