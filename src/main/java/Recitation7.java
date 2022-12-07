/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7 {
    // define your constants after this comment

    public static void main(String[] args) {
        System.out.println(leftRightTriangle(5));
        System.out.println(rightRightTriangle(9));
    }

    private static String repeatString(char aChar,int numOfReps) {
        String str = "";
        for (int count = 0; count < numOfReps;count++);
        str += aChar;
        return str;
    }



    public static String leftRightTriangle(int height) {
        String str = "";
        //add your code here
        for (int bob = 1; bob <= height; bob++) {
            for (int tom = 0; tom < bob; tom++) str += "*";
            str += "\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height) {
        String str = "";
        //add your code here
        for (int b = 1; b <= height; b++) {
            for (int c = height - b; c > 0; c--) str += " ";

            for(int RC = 0; RC < b; RC++) str += "*";

            str += "\n";
        }
        return str;
    }



        public static String circle(int radius) {
            String sen = "";
            for (int line = radius; line >= -(radius - 1); line--) {
                int Lancer = (int) Math.sqrt(radius * radius - line * line);
                int Pop = Lancer * 2;
                int Apple = (radius * 2 - Pop);
                if (Apple == radius * 2) {
                    sen += "";
                } else {
                    for (int Clap = 0; Clap < Apple / 2; Clap++) {
                        sen += " ";
                    }
                    for (int x = Pop; x * 2 > 0; x--) {
                        sen += '*';
                    }
                    sen += "\n";
                }
            }
            return sen;
        }
    }


