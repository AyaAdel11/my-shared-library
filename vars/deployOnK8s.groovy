def call(String deploymentFile) {
    echo "--- Stage 7: Deploying to Kubernetes ---"
    sh "kubectl apply -f ${deploymentFile} --validate=false"
}
