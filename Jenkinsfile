pipeline {
    agent {
        label 'demopipeline'
        }


       triggers {
          cron('''
              # leave spaces where you want them around the parameters. They'll be trimmed.
              # we let the build run with the default name
              */1 * * * *
          ''')
      }
    stages {
        stage ('Initialize') {
            steps {
                bat'''
                 echo  "%java_home%"
                '''
            }
        }

        stage ('Build') {
            steps {
                bat 'mvn test -Dcucumber.filter.tags="@datatable or @webpage"'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}