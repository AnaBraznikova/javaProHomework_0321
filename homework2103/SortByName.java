package telran.homework2103;

import java.util.Comparator;

public class SortByName implements Comparator<MyEq> {


    @Override
    public int compare(MyEq o1, MyEq o2) {

        int resultByFirstName = o1.getFirstName().compareTo(o1.getFirstName());
        int resultByLastName = o2.getLastName().compareTo(o2.getLastName());

        return resultByFirstName == 0 ? resultByFirstName : resultByLastName;



    }
}
