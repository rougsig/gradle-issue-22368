plugins {
  id("com.android.application")
  id("sample")
}

sample {
  someExampleValue = "Some Example" // This works

  inner {
    someInnerValue = "asd"
    someInnerValue = "Some Inner Value" // This works

    exampleFunction {
      someValue = "Example 1" // This doesn't work
    }
  }
}

android {
  sourceSets {
    java {

    }
  }
}
