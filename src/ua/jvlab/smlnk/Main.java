package ua.jvlab.smlnk;

import ua.jvlab.smlnk.objects.Group;
import ua.jvlab.smlnk.objects.Human;
import ua.jvlab.smlnk.objects.Student;
import ua.jvlab.smlnk.objects.UserException;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private int length;

    public static void main(String[] args) throws UserException {
        // Class Human;
        Human hm = new Human();
        hm.setNameHum("Serg");
        hm.setBirthHum(new Date(81, 8, 22));
        System.out.println(hm.infoHum() + "\n");

        // Class Student;
        Student st1 = new Student("Ivan", "Ivanov", "IT-1", new Date(91, 8, 25));
        Student st2 = new Student("Sidor", "Sidorov", "IT-2", new Date(95, 3, 17));
        Student st3 = new Student("Vasya", "Vasilyev", "IT-3", new Date(88, 7, 30));
        Student st4 = new Student("Name4", "Fam4", "IT-11", new Date(90, 10, 13));
        Student st5 = new Student("Name5", "Fam5", "IT-11", new Date(91, 12, 17));
        Student st6 = new Student("Name6", "Fam6", "IT-6", new Date(85, 5, 06));
        Student st7 = new Student("Name7", "Fam7", "IT-7", new Date(86, 6, 07));
        Student st8 = new Student("Name8", "Fam8", "IT-8", new Date(87, 7, 10));
        Student st9 = new Student("Name9", "Fam9", "IT-9", new Date(88, 8, 23));
        Student st10 = new Student("Name10", "Fam10", "IT-10", new Date(89, 5, 16));
        Student st11 = new Student("Name11", "Fam11", "IT-11", new Date(79, 4, 25));

        System.out.println(st1.infoHum() + "\n" + st2.infoHum() + "\n" + st3.infoHum() + "\n");

        // add students;
        Group st = new Group();
        st.addStud(st1);
        st.addStud(st2);
        st.addStud(st3);
        st.addStud(st4);
        st.addStud(st5);
        st.addStud(st6);
        st.addStud(st7);
        st.addStud(st8);
        st.addStud(st9);
        st.addStud(st10);
        //st.addStud(st11);

        st.showAll();
        System.out.println();


        // delete "Name5"
        st.delStudName("Name5");
        st.showAll();
        System.out.println();

        // find "Fam8"
        st.findFamlStud("Fam8");
        System.out.println();

        // Output console;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input Name");
//        String nameSt = sc.nextLine();
//        System.out.println("Input Surname");
//        String lastNameSt = sc.nextLine();
//        System.out.println("Input Group");
//        String groupSt = sc.nextLine();
//        String[] stdList = new String[]{nameSt, lastNameSt, groupSt};
//
//        for (int i = 0; i < stdList.length; i++) {
//              if (nameSt.equals(temp) & lastNameSt.equals(temp)& groupSt.equals(temp)) {
//                    System.out.println("You did not enter a name or surname or groups! Enter again!");
//                } else {
//                    System.out.println(Arrays.toString(stdList));
//                }
//                sc.close();
//            }

        // Exceptions
        //st.addStud(st11);

    }
}






