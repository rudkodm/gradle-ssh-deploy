package by.rudko.ssh_deploy

import org.gradle.api.Plugin
import org.gradle.api.Project


class SshDeployPlugin implements Plugin<Project> {
    void apply(Project project) {
        println("Hello World")
    }
}