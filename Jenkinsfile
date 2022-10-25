pipeline{
    agent any
    stages{
        stage('checkout git'){
            steps{
                echo 'Pulling ....';
                git branch : 'main',
                url : 'https://github.com/gargouri-med-skander/TestJinkins';
            }
        }
    }
}
