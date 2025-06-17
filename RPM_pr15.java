import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String regex = "((?<![а-яА-ЯЁё])\\b1?\\d?\\d\\.|(?<![а-яА-ЯЁё])\\b2[0-4]\\d\\.|(?<![а-яА-ЯЁё])\\b25[0-5]\\.){3}(1?\\d?\\d\\b(?![а-яА-ЯЁё])|2[0-4]\\d\\b(?![а-яА-ЯЁё])|25[0-5]\\b(?![а-яА-ЯЁё]))";
        String input = "hdjd 233.24.0.20 ВАП234.43.100.0 dfghj 192.168.1.1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean foundIP = false;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("ip.txt"))){
            while(matcher.find()) {
                bw.write(matcher.group() +"\n");
                foundIP = true;
            }
            if(!foundIP){
                bw.write("IP-адреса не найдены.");
            }
        }
        catch(IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}