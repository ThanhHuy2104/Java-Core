package i18n;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        Locale vi = new Locale("vi", "VN");
        Locale ja = new Locale("ja", "JP");

        LocalDate today = LocalDate.now();

        String s1 = formatDateByLocal(today, vi);
        String s2 = formatDateByLocal(today, ja);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

    public static String formatDateByLocal(LocalDate date, Locale locale) {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale(locale);
        return formatter.format(date);
    }
}
