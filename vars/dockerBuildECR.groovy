def call(String Region,String ImageTag, String AwsAccountId, String EcrRepo){
    sh """
     docker build -t ${EcrRepo} .
     docker tag ${EcrRepo}:latest ${AwsAccountId}.dkr.ecr.${Region}.amazonaws.com/${EcrRepo}:${ImageTag}
     docker tag ${EcrRepo}:latest ${AwsAccountId}.dkr.ecr.${Region}.amazonaws.com/${EcrRepo}:latest
    """
}


