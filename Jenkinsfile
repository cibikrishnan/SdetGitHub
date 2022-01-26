pipeline {
    agent {
        label 'demopipeline'}
/*     tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    } */
    stages {
        stage ('Initialize') {
            steps {
                //bat '''
                    hostname
                '''
            }
        }

        stage ('Build') {
            steps {
                bat 'mvn test -Dcucumber.filter.tags="@datatable or @webpages"'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}