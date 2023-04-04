def call (credentialId){
    waitForQualityGate abortPipeline: false, credentialsId: credentialId
}