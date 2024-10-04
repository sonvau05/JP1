package Global;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Global {
    public static boolean ignoreCase(String keyword, String str) {
        Pattern p = Pattern.compile(Pattern.quote(keyword), Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        return m.matches();
    }
}

