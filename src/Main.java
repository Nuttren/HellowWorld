import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
                task3();
        }

        // String substring(int beginIndex, int endIndex) или substring(int beginIndex) — возвращает новую строку, которая является подстрокой используемой строки. В параметрах метода нужно указать индекс строки, с которого начинается подстрока и индекс, которым заканчивается.
        //Также возможно указывать только начальный индекс. В этом случае будет возвращена подстрока от начального индекса и до конца строки.

        private static void task3() {
                String s = "0123456789";
                String name = s.substring(0, s.length()/2);
                System.out.println(name); // на консоль выведет "01234"

                String domain = s.substring(s.length()/2);
                System.out.println(domain); // на консоль выведет "56789"
        }

}







