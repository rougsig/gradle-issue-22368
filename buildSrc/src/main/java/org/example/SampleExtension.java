package org.example;

import org.gradle.api.Action;

public class SampleExtension {
    public String someExampleValue;

    public void inner(Action<Inner> action) {
        action.execute(new Inner());
    }
}
