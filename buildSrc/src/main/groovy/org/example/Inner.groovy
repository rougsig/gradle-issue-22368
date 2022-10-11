package org.example

import org.gradle.api.Action

class Inner {
    def someInnerValue

    def exampleFunction(Action<Example> action) {
        action.execute(new Example())
    }

    def exampleFunctionWithClosure(@DelegatesTo(Example) Closure<Example> closure) {
        new Example().with(closure)
    }
}
