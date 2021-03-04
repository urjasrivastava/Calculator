pipeline
{
    agent any

        stages
        {
            stage("Compile")
            {
                steps
                {   sh "cd /home/urja/Desktop/Calculator/Calculator"
                    sh "./mvnw compile"
                }
            }
            stage("Test")
            {
                steps
                {   sh "cd /home/urja/Desktop/Calculator/Calculator"
                    sh "./mvnw test"
                }
            }
        }

}