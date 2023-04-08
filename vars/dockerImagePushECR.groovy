def call(String AwsRegion, String AwsAccountId, String EcrRepo){
    docker.withRegistry(
        'https://${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com',
        'ecr:${AwsRegion}:AwsCredentials'
    ) {
        docker.image("${AwsAccountId}.dkr.ecr.${AwsRegion}.amazonaws.com/${EcrRepo}:latest").push()
    }
}