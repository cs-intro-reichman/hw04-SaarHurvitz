public class Primes {
    public static void main(String[] args) {
        //Array length
       final int N = Integer.parseInt(args[0]);
       boolean[] arr = new boolean[N + 1];
       ArrayOfPrimes(arr);
       String endSentence = Output(arr);
       System.out.println(endSentence);

       }
       

       public static String Output(boolean[] arr){
        double percentage = 0.0;
        double primes = 0;
        //counting how many primes
        System.out.println("Prime numbers up to " + (arr.length - 1));
        for(int i = 0; i < arr.length; i++){
            if(arr[i]){
                System.out.println(i);
                primes++;
            }
        }
        //calculating percentage
        percentage = (primes / (arr.length - 1)) * 100;
        String endSentence = "There are " + (int) primes + " prime numbers between 2 and " 
        + (arr.length - 1) + " (" +  (int) percentage + "% are primes)";
        return endSentence;

       }

public static boolean[] ArrayOfPrimes(boolean[] arr){
    //I assume that The array length is greater than 2
    arr[0] = false;
    arr[1] = false;
    arr[2] = true;
    //putting values True in all the odd numbers and False in all the even numbers 
        for(int i = 3; i < arr.length; i++){
            if(i % 2 != 0){
                arr[i] = true; 
            }
            else{
                arr[i] = false;
            }
        }

        int j = 3;
        int progress = j;

        while (j <= (int) Math.sqrt(arr.length)) {
            
         if(progress % j == 0 && progress != j){
            arr[progress] = false;
         }
         progress += j;
         if(progress >= arr.length){
             do {
                if(j > (int) Math.sqrt(arr.length)){
                return arr;
            }
                j++;
            } while (arr[j] == false);
            progress = j;
         }
        }

        return arr;    
        }
    
    }
