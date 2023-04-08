def call(String AwsRegion, String AwsAccountId, String EcrRepo){
    sh """
     aws ecr get-login-password --region ${AwsRegion} | docker login --username AWS --password-stdin ${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com
     docker push ${EcrRepo}:latest ${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com/${EcrRepo}:latest
    """
}