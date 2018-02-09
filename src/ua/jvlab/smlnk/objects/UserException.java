package ua.jvlab.smlnk.objects;

public class UserException extends Exception {

    @Override
    public String toString() {
       return "Attention!!! Maximum archive size reached.";
    }

}
