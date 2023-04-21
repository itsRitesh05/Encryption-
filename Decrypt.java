import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Input Encrypted Text");
            String input = s.nextLine();
            System.out.println("Decrypted Text: ");
            System.out.println(input
                    .replace("!","A").replace("@","B").replace("#","C").replace("$","D")
                    .replace("%","E").replace("^","F").replace("&","G").replace("*","H")
                    .replace("(","I").replace(")","J").replace("-","K").replace("+","L")
                    .replace("=","M").replace("~","N").replace(":","O").replace("|","P")
                    .replace(",","Q").replace("`","R").replace(".","S").replace("<","T")
                    .replace(">","U").replace("/","V").replace("{","W").replace("?","X")
                    .replace("[","Y").replace("]","Z").replace("_"," "));
        }
    }
}