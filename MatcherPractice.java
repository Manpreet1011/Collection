import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherPractice {
    public static void main(String[] args) {
        String str="manpreet singh khangura abhay khangura param";
        Pattern p=Pattern.compile("khangura");
        Matcher m=p.matcher(str);
        while (m.find())
            System.out.println(m.start());
    }
}
