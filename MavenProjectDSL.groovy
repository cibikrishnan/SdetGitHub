job('Job Name') {
    description('Maven DSL Demo')
    scm {

        git('https://github.com/cibikrishnan/SdetGitHub.git', 'master')
    }

    triggers {
        scm('0 0/1 * 1/1 * ? *')
    }

    steps {

        maven('test -Dcucumber.filter.tags="@datatable and @webpage"', 'pom.xml') {
//            goals('test -Dcucumber.filter.tags="@datatable"')
        }


    }

}