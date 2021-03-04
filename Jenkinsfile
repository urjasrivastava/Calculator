pipeline
{
    agent any

        stages
        {
            stage("Compile")
            {
                steps
                {   sh "cd /Desktop/Calculator/Calculator"
                    sh "./mvnw compile"
                }
            }
            stage("Test")
            {
                steps
                {   sh "cd /Desktop/Calculator/Calculator"
                    sh "./mvnw test"
                }
            }
        }

}