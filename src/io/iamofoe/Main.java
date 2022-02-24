package io.iamofoe;



import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(1, List.of(10,20,30));

        /**Before**/
        System.out.println(student.getId());
        System.out.println(student.getGrades());

        /**attempt to mutate List<Integer> grades;**/
        student.getGrades().add(50);
        student.getGrades().add(60);

        /**Returns with no change to class**/
        System.out.println(student.getGrades());

        /** Application in immutable array **/
        Student student1 = new Student(1, List.of(10,20,30));
        Student student2 = new Student(1, List.of(10,20,30));
        Student student3 = new Student(1, List.of(10,20,30));

        List<Student> studentList = Collections.unmodifiableList(List.of(student1, student2, student3));
        System.out.println(studentList);

        /**throws UnsupportedOperationException**/
//        immutableClassList.add(immutableClass);





    }
}
