package org.example;

import org.gradle.api.Action;

public class Inner {
    public String someInnerValue;

    public void exampleFunction(Action<Example> action) {
        action.execute(new Example());
    }
}
