import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher larry = new Teacher(1,"Larry",500);
        Teacher alexa = new Teacher(2,"Alexa",700);
        Teacher joe = new Teacher(3,"Joe",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(larry);
        teacherList.add(alexa);
        teacherList.add(joe);

        Student tamasha = new Student(1,"Tamasha",4);
        Student lani = new Student(2,"Lani",12);
        Student rabbi = new Student(3,"Rabbi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(lani);

        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);

        tamasha.payFees(5000);
        lani.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("----Making SCHOOL PAY SALARY----");
        larry.receiveSalary(larry.getSalary());
        System.out.println("GHS has spent for salary to " + larry.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        joe.receiveSalary(joe.getSalary());
        System.out.println("GHS has spent for salary to " + joe.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(lani);

        alexa.receiveSalary(alexa.getSalary());

        System.out.println(alexa);


    }
}
