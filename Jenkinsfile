pipeline
{
    agent any
    environment
    {   dockerImage=''
        registry='urjasri/calculator'
        registryCredential='dockerhub_id'
    }
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
                    script
                    {
                        dockerImage=docker.build registry
                    }
                }
            }
            stage("Docker Push")
            {
                steps
                {
                    script
                    {
                        docker.withRegistry('',registryCredential)
                        {
                            dockerImage.push()
                        }
                    }
                }
            }
        }

}