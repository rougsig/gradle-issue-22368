package org.example;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class SamplePlugin implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        target.getExtensions().create("sample", SampleExtension.class);
    }
}
