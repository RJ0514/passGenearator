import java.util.*;

public class model
{
    private String strPassword;
    private int passLength;
    private Boolean strSpecialChar;
    private Boolean bInt;

    public model(){
        strPassword = "";
        bInt = strSpecialChar = false;
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
        String s = "_";
        if(strSpecialChar && bInt)
            s = "0123456789_!@#$%&*/~";
        else if(strSpecialChar)
            s = "_!@#$%&*/~";
        else if(bInt)
            s = "0123456789";

        return s.charAt(r.nextInt(s.length()));
    }

    public void generatePassword(){
        StringBuilder s = new StringBuilder();
        Random r = new Random();
        int i = 0;
        while(s.length() < passLength) {
            if(i % (r.nextInt(passLength) + 1) == 0)
                s.append(randoChar(i));
            else
                s.append(randoSpecialChar());
            i++;
        }
        strPassword = s.toString();
    }

    public String getPassword() {
        return strPassword;
    }

    public void setPassLength(int len){
        passLength = len;
    }

    public void setbInt(Boolean bInt) {
        this.bInt = bInt;
    }

    public void setStrSpecialChar(Boolean strSpecialChar) {
        this.strSpecialChar = strSpecialChar;
    }

    public static void main(String[] args) {
        model testModel = new model();
        testModel.setPassLength(8);

        testModel.generatePassword();
        System.out.println(testModel.getPassword());

    }
}
