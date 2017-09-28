import com.sun.security.ntlm.Server;

public class ServerNameGenerator {
    public static String fer;

    public static void main(String[] args) {

        // static methods can be called directly from the class
        // non-static must be instantiated first
        ServerNameGenerator sng = new ServerNameGenerator();
        System.out.print("Your new server name is: ");
        System.out.print(sng.randString(sng.adjectives) + "-" + sng.randString(sng.nouns));


    }

    String [] adjectives = {
            "pretty", "nice", "clean", "optimistic", "bright",
            "cheerful", "peaceful", "tranquil", "enlightened", "loving"
    };

    String [] nouns = {
            "propagation", "sutra", "lotus", "buddha", "world",
            "votary", "youth", "leader", "Sensei", "sgi"
    };




    public String randString(String[] chosenArr) {
             int randIndex = (int) Math.floor(Math.random() * chosenArr.length);
             return chosenArr[randIndex];
    }
}
