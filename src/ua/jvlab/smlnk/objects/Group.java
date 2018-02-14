package ua.jvlab.smlnk.objects;

public class Group {

    private Student[] grLst = new Student[10];
    private int n = 0;

    public void addStud(Student std) {
        grLst[n++] = std;
    }

    public void delStudName(String newName) {
        for (int i = 0; i < grLst.length; i++) {
            if (grLst[i] != null && grLst[i].getNameSt().equals(newName)) {
                grLst[i] = null;
                break;
            }
        }
    }

    public void findFamlStud(String famlName) {
        for (int i = 0; i < grLst.length; i++) {
            if (grLst[i] != null && grLst[i].getLastNameSt().equals(famlName)) {
                System.out.println(famlName);
            }
        }
    }

    public void showAll () {
        for (int i = 0; i < grLst.length; i++) {
            Student lst = grLst[i];
            if (lst != null) {
                System.out.println(lst.getNameSt() + " " + lst.getLastNameSt() + " " + lst.getGroupNumbSt() + " " + lst.getBirthSt());
            }
        }
    }

}