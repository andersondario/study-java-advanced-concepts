package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObjectUtilsTest {

    @Test
    public void withAllArgumentsNullMethodShouldReturnTrue() {
        assertTrue(ObjectUtils.isNull(null, null, null));
    }

    @Test
    public void withSomeArgumentsNotNullMethodShouldReturnTrue() {
        assertTrue(ObjectUtils.isNotNull(null, null, new Object()));
    }

    @Test
    public void withNotAllArgumentsNullMethodShouldReturnFalse() {
        assertFalse(ObjectUtils.isNull(new Object(), null, null));
    }

    @Test
    public void withAllArgumentsNullMethodShouldReturnFalse() {
        assertFalse(ObjectUtils.isNotNull(null, null));
    }
}
