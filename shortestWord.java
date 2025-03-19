/*Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
*/
public class shortestWord {
    public static void main(String[] args){
        System.out.println(findShort("How can mirrors be real if our eyes aren't real"));
    }
        public static int findShort(String s) {
          String[] arr=s.split(" ");
          String shortest=arr[0];
            for(String value:arr){
              if(value.length()<shortest.length()){
                shortest=value;
              }
            }
          return shortest.length();
        }
    }
