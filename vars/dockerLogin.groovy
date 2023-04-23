def call (String hubUser, String hubAccessToken ) {
    sh """
    docker login -u ${hubUser} -p ${hubAccessToken}
    """
}