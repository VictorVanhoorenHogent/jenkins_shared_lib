def call(String AwsRegion, String AwsAccountId, String EcrRepo){
    sh"""
    aws ecr get-login-password --region ${AwsRegion} | docker login --username AWS --password-stdin ${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com
    docker push ${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com/${EcrRepo}:latest
    """
}





//   docker.withRegistry(
//        "https://${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com",
//        "ecr:${AwsRegion}:AwsCredentials"
//    ) {
//        docker.image("${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com/${EcrRepo}:latest").push()
//    } 