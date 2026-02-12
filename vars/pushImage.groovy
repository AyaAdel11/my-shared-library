def call(String imageName) {
    echo "--- Stage 5: Pushing Image to Registry ---"
    sh "docker push ${imageName}"
}
