pipeline
{
    agent any

        stages
        {

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
                    sh "docker login --username urjasri --password dfgoki9999"
                    sh "docker push urjasri/calculator"
                }
            }
        }

}