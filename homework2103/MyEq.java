package telran.homework2103;

import java.util.Objects;

//Описание задания.
//
//        1 уровень сложности: Задача :
//        Дан массив пар, состоящий из двух строк с именами и фамилиями,отсортировать массив в возрастающем лексикографическом порядке имени, и если две
//        строки одинаковы, отсортируйте их по фамилии.
//        Input: { {"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"}
//        }
//        Output: { {"abc", "last"}, {"pklz", "yelp"}, {"ppza", "xyz"}, {"rpng",
//        "note"} }
//
//        2 уровень сложности:
public class MyEq {


    private String firstName;
    private String lastName;

    public MyEq(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof MyEq)) return false;

        MyEq myEq = (MyEq) obj;

        return this.firstName.equals(myEq.firstName) && this.lastName.equals(myEq.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName);
    }

    @Override
    public String toString() {
        return " {" +
                " '" + firstName + '\'' +
                " '" + lastName + '\'' +
                '}';
    }
}
