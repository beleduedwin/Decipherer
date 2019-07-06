
public class Decipherer{

    //Initialisation variable constant
    final static String DELETE_CHAR = "@#?";
    final static String REPLACE_CHAR = " ";
    final static int INIT_STRING=6;

    public static void main(String[] args) {

        //Initialisation variables
        String [] messages = {
                "0@sn9sirppa@#?ia'jgtvryko1",
                "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
                "aopi?sedohtém@#?sedhtmg+p9l!"
        };

        String[] tabString = new String[3];

        for(int i = 0; i < 3; i ++){

            tabString[i] = deCodeMessage(messages[i]);
            System.out.println(tabString[i]);
            }
       }

//Methode pour inverser les caractère
    public static String reverseIt(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }

    public static String deCodeMessage(String codeMessage) {

        int messageLength = codeMessage.length()/2;
        String keyCode = codeMessage.substring(5,5+messageLength);

        while(keyCode.contains(DELETE_CHAR)){
            keyCode = keyCode.replace(DELETE_CHAR, REPLACE_CHAR);
        }

        //inverser les caracteurs
        keyCode=reverseIt(keyCode);
        return keyCode;

    }

}