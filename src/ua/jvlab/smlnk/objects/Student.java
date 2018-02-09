package ua.jvlab.smlnk.objects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Human {

    private String nameSt;
    private String lastNameSt;
    private String groupNumbSt;
    private Date birthSt;


    public String getNameSt() {
        return nameSt;
    }

    public void setNameSt(String nameSt) {
        this.nameSt = nameSt;
    }

    public String getLastNameSt() {
        return lastNameSt;
    }

    public void setLastNameSt(String lastNameSt) {
        this.lastNameSt = lastNameSt;
    }

    public String getGroupNumbSt() {
        return groupNumbSt;
    }

    public void setGroupNumbSt(String groupNumbSt) {
        this.groupNumbSt = groupNumbSt;
    }

    public String getBirthSt() {
        DateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy");
        return sdf1.format(birthSt);
    }

    public void setBirthSt(Date birthSt) {
        this.birthSt = birthSt;
    }

    public Student(String nameSt, String lastNameSt, String groupNumbSt, Date birthSt) {

        this.nameSt = nameSt;
        this.lastNameSt = lastNameSt;
        this.groupNumbSt = groupNumbSt;
        this.birthSt = birthSt;


    }

    public Student() {
        super();
    }

    @Override
    public String infoHum() {
        return ("Name: " + getNameSt() + ", Famile: " + getLastNameSt() + ", Group-" + getGroupNumbSt() + ", date birth: " + getBirthSt());
    }

   }
