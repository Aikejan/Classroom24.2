import java.io.FileReader;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Student implements Person {
    private String lastName;
    private LocalDate LocalDate;
    private byte age;
    private int money;
    private Gender gender;

    public Student() {
    }

    public Student(String lastName, java.time.LocalDate localDate, int money, Gender gender) {
        this.lastName = lastName;
        this.age = (byte) Period.between(localDate, LocalDate.now()).getYears();
        this.money = money;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public java.time.LocalDate getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(java.time.LocalDate localDate) {
        this.LocalDate = localDate;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nlastName: " + lastName +
                "  age: " + LocalDate +
                "  money: " + money +
                "  gender: " + gender +
                " age: " + age;
    }

    public String search(ArrayList<Student> name) {
        for (Student a : name) {
            if (a.getLastName().startsWith("A") || a.getLastName().startsWith("B")) {
                System.out.println(a.toString());
            }
        }
        return "";
    }

    @Override
    public int greatage(ArrayList<Student> age) {
        for (Student s : age) {
            if (s.getAge() >= 15 || s.getMoney() > 2000) {
                if (s.getGender().equals(Gender.MALE))
                    System.out.println(s.toString());
            }
        }
        return 0;
    }

    @Override
    public int biggestmoney(ArrayList<Student> money) {
        for (Student d : money) {
            if (d.getMoney() < 0 || d.getMoney() > 4000) {
                System.out.println(d.toString());
            }
        }
        return 0;
    }


    @Override
    public void biggestggerl(ArrayList<Student> namegirl) {
        for (Student d : namegirl) {
            if (d.getMoney() < 0 || d.getMoney() > 3000) {
                if (d.getGender().equals(Gender.FEMALE))
                    System.out.println(d.toString());
            }
        }
        return;
    }

    @Override
    public String allStudents(ArrayList<Student> studentsName) {
        for (Student s : studentsName) {
            return s.getLastName();
        }
        return null;
    }

    @Override
    public int addMoneyStudents(ArrayList<Student> addMoney) {
        for (Student s : addMoney) {
            return s.getMoney() + 1000;
        }
        return 0;
    }

    @Override
    public String firststudent(ArrayList<Student> ferstStudent) {
        return ferstStudent.get(0).toString();
    }

    @Override
    public int HowManyStudent(ArrayList<Student> student) {
        return student.size();
    }

    @Override
    public String boysAndGirls(ArrayList<Student> student) {
        ArrayList<Student>female  = new ArrayList<>();
        for (Student s : student) {
            if (s.getGender().equals(Gender.FEMALE)) {
                female.add(s);
                System.out.println(s.getLastName());


            }


        }System.out.println(female);
                        for (Student u:student){
                    if(u.getGender().equals(Gender.MALE)){
                        female.add(u);
                        System.out.println(u.getLastName());}}
        System.out.println(female);
        return "";
    }}







