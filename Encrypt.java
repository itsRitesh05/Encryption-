import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Input Text");
            String input = s.nextLine();
            System.out.println("Encrypted Text: ");
            System.out.println(input.replace("A","!").replace("a","!").replace("B","@").replace("b","@")
            .replace("C","#").replace("c","#").replace("D","$").replace("d","$")
            .replace("E","%").replace("e","%").replace("F","^").replace("f","^")
            .replace("G","&").replace("g","&").replace("H","*").replace("h","*")
            .replace("I","(").replace("i","(").replace("J",")").replace("j",")")
            .replace("K","-").replace("k","-").replace("L","+").replace("l","+")
            .replace("M","=").replace("m","=").replace("N","~").replace("n","~")
            .replace("O",":").replace("o",":").replace("P","|").replace("p","|")
            .replace("Q",",").replace("q",",").replace("R","`").replace("r","`")
            .replace("S",".").replace("s",".").replace("T","<").replace("t","<")
            .replace("U",">").replace("u",">").replace("V","/").replace("v","/")
            .replace("W","{").replace("w","{").replace("X","?").replace("x","?")
            .replace("Y","[").replace("y","[").replace("Z","]").replace("z","]")
            .replace(" ", "_"));
        }
    }
    
}