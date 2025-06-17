import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String regex = "(/\\*(.*?[\\s\\S]*?)*?\\*/)|(?<![(:\"])(//.*)";
        Pattern pattern = Pattern.compile(regex);
        try(BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("Test2.txt"))){
            StringBuilder sb = new StringBuilder();
            int code = -1;
            while ((code=br.read())!=-1) {
                sb.append(Character.toChars(code));
            }
            Matcher matcher = pattern.matcher(sb);
            String code1 = matcher.replaceAll("");
            String[] str = code1.split("\\n");
            for (String str1 : str) {
                if (!str1.trim().isEmpty()) {
                    bw.write(str1+"\n");
                }
            }
        }
        catch(IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}