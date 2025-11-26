public class MyString {
    public static void main(String[] args) {
       /*  System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false*/
       //System.out.println(contains("baba yaga", "babayaga"));
        System.out.println(contains("baba yaga", "baba"));
        System.out.println(contains("baba yaga", ""));
       System.out.println(contains("baba yaga", "John Wick is the baba yaga"));
        System.out.println(contains("baba yaga", "Yaga"));
        System.out.println(contains("baba yaga", "babayaga"));
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        char c = ' ';
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            if(c <= 90 && c >= 65){
                c += 32;
            }
            newStr = newStr + c;
        }
        return newStr;
    }


    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
       
        if(str1.length() < str2.length()){
            return false; //In this case there's no need to even check this
        }
        if(str2.length() == 0){
        return true;
       }
        String newS1 = str1;
        String newS2 = str2;
        int stCounter = 0;
        int resetI = 0;

        for(int i = 0; i < newS1.length(); i++){
            for(int j = 0; j<newS2.length(); j++){
               
                resetI = i;
                
                if(newS1.charAt(i) == newS2.charAt(j)){
                    stCounter++;
                    i++;
                }
                if(stCounter == newS2.length()){
                    return true;
                }
            } 
            stCounter = 0;
            i = resetI;
    }
        return false;
    }
}
