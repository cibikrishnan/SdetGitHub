job('Job Name') {
    description('Maven DSL Demo')
    scm {

        git('https://github.com/cibikrishnan/SdetGitHub.git', 'master')
    }

    triggers {
        scm('*****')
    }

    steps {

        maven('test -Dcucumber.filter.tags="@datatable"', 'pom.xml') {
//            goals('test -Dcucumber.filter.tags="@datatable"')
        }


    }

}