package ua.jvlab.smlnk.objects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String nameHum;
    private Date birthHum;

    public String getNameHum() {
        return nameHum;
    }

    public void setNameHum(String nameHum) {
        this.nameHum = nameHum;
    }

    public String getBirthHum() {

        DateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy");
        return sdf1.format(birthHum);
    }

    public void setBirthHum(Date birthHum) {
        this.birthHum = birthHum;
    }

    public Human(String nameHum, Date birthHum) {

        this.nameHum = nameHum;
        this.birthHum = birthHum;
    }

    public Human() {
    }

    public String infoHum() {
        return ("My name " + getNameHum() + ", birth date: " + getBirthHum());
    }
}
