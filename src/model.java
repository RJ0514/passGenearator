import java.util.*;

public class model
{
    private String strPassword;
    private int passLength;

    public model(){
        strPassword = "";
    }
    /*
    * Function that generates random Upper and Lowercase characters.*/
    public char randoChar(int n){
        Random randoInt = new Random();
        int randNum;
        char c;

        randNum = randoInt.nextInt(26);
        c = (char) ((n % (randoInt.nextInt(passLength) + 1) == 0) ? randNum + 'a' : randNum + 'A');
        return c;
    }

    public char randoSpecialChar(){
        Random r = new Random();
        String s = "0123456789_!@#$%&*/~";

        return s.charAt(r.nextInt(s.length()));
    }

    public void generatePassword(){
        StringBuilder s = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < passLength; i++) {
            if(i % (r.nextInt(passLength) + 1) == 0)
                s.append(randoChar(i));
            else
                s.append(randoSpecialChar());
        }
        strPassword = s.toString();
    }

    public String getPassword() {
        return strPassword;
    }

    public void setPassLength(int len){
        passLength = len;
    }

    public static void main(String[] args) {
        model testModel = new model();
        testModel.setPassLength(8);

        testModel.generatePassword();
        System.out.println(testModel.getPassword());

    }
}
