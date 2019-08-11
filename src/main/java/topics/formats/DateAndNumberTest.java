package topics.formats;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import static java.text.DateFormat.*;
import static java.text.NumberFormat.getNumberInstance;

public class DateAndNumberTest {

    public static void main(String[] args) throws ParseException {
        final Locale localeBrazil = new Locale("pt", "BR");
        final Locale localeUnitedStates = new Locale("en", "US");

        final DateFormat[] dfs = { getDateInstance(LONG, localeBrazil), getDateInstance(LONG, localeUnitedStates) };
        final NumberFormat[] nfs = { getNumberInstance(localeBrazil), getNumberInstance(localeUnitedStates) };
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy");

        final Calendar calendar = Calendar.getInstance();
        final Double value = 12.53;

        for (DateFormat df : dfs) {
            System.out.println(df.format(calendar.getTime()));
        }

        for (NumberFormat nf : nfs) {
            System.out.println(nf.format(value));
        }

        System.out.println(simpleDateFormat.parse("01-02-12 DC"));
    }
}
