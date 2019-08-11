package topics.resurcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    public static void main(String[] args) {
//        ResourceBundle rb = ResourceBundle.getBundle("messages", Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("messages", Locale.US);

        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("hello"));

        rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("hello"));
    }
}
