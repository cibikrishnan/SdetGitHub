job('Job Name') {
    description('Maven DSL Demo on ${new Date()}')
    scm {

        git('https://github.com/cibikrishnan/SdetGitHub.git', 'master')
    }

    triggers {
        scm('*****')
    }

    steps {

        maven('clean install test -Dtags= @datatable ', 'pom.xml') {
            goals('test')
        }


    }

}