package io.iamofoe;



import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(1, List.of(10,20,30));

        /**Before**/
        System.out.println(immutableClass.getX());
        System.out.println(immutableClass.getGrades());

        /**attempt to mutate List<Integer> grades;**/
        immutableClass.getGrades().add(50);
        immutableClass.getGrades().add(60);

        /**Returns with no change to class**/
        System.out.println(immutableClass.getGrades());

        /** Application in immutable array **/
        ImmutableClass immutableClass1 = new ImmutableClass(1, List.of(10,20,30));
        ImmutableClass immutableClass2 = new ImmutableClass(1, List.of(10,20,30));
        ImmutableClass immutableClass3 = new ImmutableClass(1, List.of(10,20,30));

        List<ImmutableClass> immutableClassList = Collections.unmodifiableList(List.of(immutableClass1, immutableClass2, immutableClass3));
        System.out.println(immutableClassList);

        /**throws UnsupportedOperationException**/
//        immutableClassList.add(immutableClass);





    }
}
