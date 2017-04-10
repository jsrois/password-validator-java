package org.tdd;

/**
 * Created by jsanchez on 10/04/17.
 */
public class Password {
    public static final int MINIMUM_PASS_LENGTH = 6;
    private final String text;

    public Password(String text) {
        this.text = text;
    }

    public boolean valid() {
        return hasMinimumLength();
    }

    private boolean hasMinimumLength() {
        return text.length()>= MINIMUM_PASS_LENGTH;
    }
}
