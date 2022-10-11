package org.example

import org.gradle.api.Action

class SampleExtension {
    def someExampleValue

    def inner(Action<Inner> action) {
        action.execute(new Inner())
    }

    def innerWithClosure(@DelegatesTo(Inner) Closure<Inner> closure) {
        new Inner().with(closure)
    }
}
