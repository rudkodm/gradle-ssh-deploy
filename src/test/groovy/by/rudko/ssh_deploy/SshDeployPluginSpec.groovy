package by.rudko.ssh_deploy

import spock.lang.Specification


class SshDeployPluginSpec extends Specification {
    def "Hello World Test"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Hello"  | 5
        "World"  | 5
    }
}
