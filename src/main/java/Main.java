import java.io.File;

public class Main {


    public static void main(String[] args) throws Exception {

       BooleanSearchEngine engine = new BooleanSearchEngine(new File("pdfs"));
       System.out.println(new BooleanSearchEngine(new File("pdfs")).search("Покер"));

        Server server = new Server(8989);
        server.serverStart();

    }
}