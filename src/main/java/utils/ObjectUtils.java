package utils;

public class ObjectUtils {

    public static boolean isNull(Object ...objects) {
        for (Object object : objects) {
            if (object != null) return false;
        }
        return true;
    }

    public static boolean isNotNull(Object ...objects) {
        return !isNull(objects);
    }
}
