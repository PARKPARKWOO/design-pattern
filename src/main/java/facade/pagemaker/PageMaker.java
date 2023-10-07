package facade.pagemaker;

import java.io.FileWriter;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddr, String fileName) {
        try {
            Properties mailProp = Database.getProperties("src/main/java/facade/pagemaker/maildata");
            String username = mailProp.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title(username + "'s page!");
            writer.paragraph("Welcome to " + username + "'s page!");
            writer.paragraph("Nice to meet you");
            writer.mailto(mailAddr, username);
            writer.close();
            System.out.println(fileName + " is created for " + mailAddr + " (" + username + ")");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
