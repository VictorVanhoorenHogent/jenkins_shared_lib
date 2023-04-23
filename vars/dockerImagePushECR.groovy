def call(String AwsRegion, String ImageTag, String AwsAccountId, String EcrRepo){
    sh"""
    echo {\\"credHelpers\\": {\\"${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com\\":\\"ecr-login\\"}} > /var/lib/jenkins/.docker/config.json
    docker push ${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com/${EcrRepo}:${ImageTag}
    docker push ${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com/${EcrRepo}:latest
    """
}





//   docker.withRegistry(
//        "https://${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com",
//        "ecr:${AwsRegion}:AwsCredentials"
//    ) {
//        docker.image("${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com/${EcrRepo}:latest").push()
//    } 