job('Job Name') {
    description('Maven DSL Demo on ${new Date()}')
    scm {

        git('https://github.com/cibikrishnan/SdetGitHub.git', 'master')
    }

    triggers {
        scm('*****')
    }

    steps {

        maven('clean', 'pom.xml') {
            goals('test -Dcucumber.filter.tags="@smoke"')
        }


    }

}