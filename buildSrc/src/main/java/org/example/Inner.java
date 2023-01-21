package org.example;

import groovy.lang.Closure;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.gradle.api.Action;
import org.gradle.util.internal.ConfigureUtil;

import java.util.function.Function;

public class Inner {
    public String someInnerValue;

    public void exampleFunction(Closure<Example> action) {
        ConfigureUtil.configure(action, new Example());
    }

//    public void exampleFunction(Function1<Example, Unit> action) {
//        action.invoke(new Example());
//    }

    public void exampleFunction(Action<Example> action) {
        action.execute(new Example());
    }
}
