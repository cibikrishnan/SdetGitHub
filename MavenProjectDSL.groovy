job('Job Name') {
    description('Maven DSL Demo')
    scm {

        git('https://github.com/cibikrishnan/SdetGitHub.git', 'master')
    }

    triggers {
        cron('*/1 * * * *')
    }

    steps {

        maven('test -Dcucumber.filter.tags="@datatable or @webpage"', 'pom.xml') {
//            goals('test -Dcucumber.filter.tags="@datatable"')
        }


    }

}