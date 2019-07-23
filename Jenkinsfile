node {
    stage ("Build") {
        checkout scm
        withMaven() {
            sh "./mvnw clean verify"
        }
    }
}
