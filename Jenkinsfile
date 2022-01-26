pipeline {
    agent {
        label 'demopipeline'}
        CRON_SETTINGS = '''* * * * * % ENV=STAGING'''
  triggers {
    parameterizedCron('''

                */2 * * * * %ENV=STAGING
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