def call (String hubUser, String hubAccessToken ) {
    sh """
    echo ${hubAccessToken} | docker login -u ${hubUser} --password-stdin
    """
    sh 'cat /home/ubuntu/.docker/config.json | base 64'
}