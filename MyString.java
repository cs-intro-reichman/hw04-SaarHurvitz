public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
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
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
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
       if(str1.length() == 0 || str2.length() == 0){
        return false;
       }
        if(str1.length() < str2.length()){
            return false; //In this case there's no need to even check this
        }
        String newS1 = str1.toLowerCase();
        String newS2 = str2.toLowerCase();
        int stCounter = 0;
        
        for(int i = 0; i < newS1.length(); i++){
            
                while (newS1.charAt(i) == newS2.charAt(stCounter)) {
                    stCounter++;
                    i++;
                    if(stCounter == str2.length()){
                    return true;
                }
                //Making sure I won't reach the limit
                if(i == newS1.length()){
                    return false;
                }

                }
            
            stCounter = 0;
        }
        return false;
    }
}
