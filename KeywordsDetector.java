public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i = 0; i < sentences.length; i++){
            for(int j = 0; j < keywords.length; j++){
              String lowerCase1 = LowerCase(sentences[i]);
              String lowerCase2 = LowerCase(keywords[j]);
              if(contains(lowerCase1, lowerCase2)){
                System.out.println(sentences[i]);
              }
            }
        }
    }

    public static String LowerCase(String str) {
		
		char c = ' ';
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			if("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".indexOf(str.charAt(i)) != -1){
					c = Character.toLowerCase(str.charAt(i));
					sb.append(c);		

		}
		
	}
	return sb.toString();
	} 
        /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
       
        if(str1.length() < str2.length()){
            return false; //In this case there's no need to even check this
        }
        int stCounter = 0;
        
        for(int i = 0; i < str1.length(); i++){
            
                while (str1.charAt(i) == str2.charAt(stCounter)) {
                    stCounter++;
                    i++;
                    if(stCounter == str2.length()){
                    return true;
                }
                //Making sure I won't reach the limit
                if(i == str1.length()){
                    return false;
                }

                }
            
            stCounter = 0;
        }
        return false;
    }
}

