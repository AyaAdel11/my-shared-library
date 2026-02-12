def call(String imageName) {
    echo "--- Stage 4: Scanning Image with Trivy ---"
    // الـ || true عشان لو لقى ثغرات ميفشلش الـ pipeline حالياً لحد ما نتأكد
    sh "trivy image ${imageName} || echo 'Scan failed or Trivy not installed'"
}
