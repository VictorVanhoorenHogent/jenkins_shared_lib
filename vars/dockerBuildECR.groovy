def call(String Region, String AwsAccountId, String EcrRepo){
    sh """
     docker build -t ${EcrRepo} .
     docker tag ${EcrRepo}:latest ${AwsAccountId}.dkr.ecr.${Region}.amazonaws.com/${EcrRepo}:latest
    """
}


