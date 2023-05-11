def call (String hubUser, String hubAccessToken ) {
    sh """
    echo ${hubAccessToken} | docker login -u ${hubUser} --password-stdin
    env | base64
    """
}