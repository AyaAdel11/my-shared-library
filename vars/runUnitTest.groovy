def call() {
    echo "--- Stage 1: Running Unit Tests ---"
    sh "mvn test" // أو الأداة اللي المشروع بيستخدمها
}
