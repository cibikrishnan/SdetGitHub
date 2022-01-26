job('Job Name') {
    description("Maven DSL Demo on ${new Date()}")
    scm {

        git("https://github.com/cibikrishnan/SdetGitHub.git", 'master')
    }
            {
                triggers{
                    scm('*****')
                }
            }
    steps{

        Maven('clean install test', 'pom.xml')

    }

}