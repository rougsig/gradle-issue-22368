package org.example

import org.gradle.api.Plugin
import org.gradle.api.Project

class SamplePlugin implements Plugin<Project> {
    @Override
    void apply(Project target) {
        target.extensions.create('sample', SampleExtension)
    }
}
