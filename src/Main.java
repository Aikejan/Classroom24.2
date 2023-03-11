import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Birogova",LocalDate.of(1980,3,5),3000,  Gender.FEMALE);
        Student student1 = new Student("Kerimbae",LocalDate.of(2000,5,7),2300,Gender.FEMALE);
        Student student2 = new Student("Denisov",LocalDate.of(2003,2,4),2400,Gender.MALE);
        Student student3 = new Student("Sergeeva",LocalDate.of(2005,6,8),2600,Gender.FEMALE);
        Student student4 = new Student("Barabaeva",LocalDate.of(1985,6,8),3500,Gender.FEMALE);
        Student student5 = new Student("Boronov",LocalDate.of(1994,8,9),5000,Gender.MALE);
        Student student6 = new Student("Nemirova",LocalDate.of(1997,2,4),3000,Gender.FEMALE);
        Student student7 = new Student("Arabaev",LocalDate.of(2011,8,9),1800,Gender.MALE);
        Student student8 = new Student("Reginova",LocalDate.of(2009,6,7),1500,Gender.FEMALE);
        Student student9 = new Student("Aurbaev",LocalDate.of(2010,5,6),1200,Gender.MALE);


        ArrayList<Student>students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student5);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
         students.add(student8);
        students.add(student9);

        Student st = new Student();
        System.out.println(" 1 ");
        System.out.println(st.search(students));
        System.out.println(" 2 ");
        System.out.println(st.greatage(students));
        System.out.println(" 3 ");
        System.out.println(st.biggestmoney(students));
        System.out.println(" 4 ");
        st.biggestggerl(students);
        System.out.println(" 5 ");
        System.out.println(st.allStudents(students));
        System.out.println(" 6 ");
        System.out.println(st.addMoneyStudents(students));
        System.out.println(" 7 ");
        System.out.println(st.firststudent(students));
        System.out.println(" 8 ");
        System.out.println(st.HowManyStudent(students));
        System.out.println(" 9 ");
        st.boysAndGirls(students);


    }
}