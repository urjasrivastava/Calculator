pipeline
{
    agent any

        stages
        {
         stage("Fix the permission issue")
         {

                agent any

                steps {
                    sh "sudo chown root:jenkins /run/docker.sock"
                }

            }
            stage("Compile")
            {
                steps
                {
                    sh "./mvnw compile"
                }
            }
            stage("Test")
            {
                steps
                {
                    sh "./mvnw test"
                }
            }
            stage("Package")
            {
                steps
                {
                    sh "./mvnw package"
                }
            }
            stage("Docker Build")
            {
                steps
                {
                    sh "docker build -t urjasri/calculator ."
                }
            }
            stage("Docker Push")
            {
                steps
                {
                    sh "docker push urjasri/calculator"
                }
            }
        }

}