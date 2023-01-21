package org.example;

import groovy.lang.Closure;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.gradle.api.Action;
import org.gradle.util.internal.ConfigureUtil;

public class SampleExtension {
    public String someExampleValue;

    public void inner(Closure<Inner> action) {
        ConfigureUtil.configure(action, new Inner());
    }

    public void inner(Action<Inner> action) {
        action.execute(new Inner());
    }

//    public void inner(Function1<Inner, Unit> action) {
//        action.invoke(new Inner());
//    }
}
