package LW2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"#FFFFFF", "#FF3421", "#00ff00", "232323", "f#fddee", "#fd2", "#123456", "#ABCDEF", "#00FFAA", "#f0f0f0", "#123abc", "#aabbcc", "#789012", "#FF0000"};


        Pattern pattern = Pattern.compile("^#([A-Fa-f0-9]{6})$");

        for (String color : colors) {
            Matcher matcher = pattern.matcher(color);
            if (matcher.matches()) {
                System.out.println(color + " - это шестнадцатиричный идентификатор цвета в HTML");
            } else {
                System.out.println(color + " - не является шестнадцатиричным идентификатором цвета в HTML");
            }
        }
    }
}
