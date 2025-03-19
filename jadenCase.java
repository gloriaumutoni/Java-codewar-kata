//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Main {

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

    public static String toJadenCase(String phrase) {
        if (phrase != null && !phrase.isEmpty()) {
            String[] arr = phrase.split(" ");
            StringBuilder result = new StringBuilder();
            String value;
            for(int i = 0; i < arr.length; ++i) {
                value = arr[i];
                if (i > 0) {
                    result.append(" ");
                }

                for(int j = 0; j < value.length(); ++j) {
                    if (j == 0) {
                        result.append(Character.toUpperCase(value.charAt(j)));
                    } else {
                        result.append(value.charAt(j));
                    }
                }
            }

            return result.toString();
        } else {
            return null;
        }
    }
}
