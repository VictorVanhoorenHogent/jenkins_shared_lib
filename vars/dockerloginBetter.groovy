withEnv(["DOCKER_CONFIG=" + pwd(tmp:true) + "/.docker"]) {

  // Create a temporary Docker config file
  sh '''
    mkdir -p \${DOCKER_CONFIG}
    echo '{"credsStore":"envvars"}' > \${DOCKER_CONFIG}/config.json
  '''
  withCredentials([usernamePassword(credentialsId: 'dockerhub-ro', passwordVariable: 'DOCKER_CREDS_PASSWORD', usernameVariable: 'DOCKER_CREDS_USERNAME')]) {

        // Run docker commands ....
        [...]

  }
  sh "[ -d \$DOCKER_CONFIG ] && rm -rf \$DOCKER_CONFIG"
}