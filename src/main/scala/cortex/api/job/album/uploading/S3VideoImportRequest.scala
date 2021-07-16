package cortex.api.job.album.uploading

@SerialVersionUID(0L)
final case class S3VideoImportRequest(
    bucketName: String = "",
    awsRegion: String = "",
    awsAccessKey: String = "",
    awsSecretKey: String = "",
    awsSessionToken: String = "",
    videoPath: String = "",
    targetPrefix: String = "",
    frameCaptureRate: Int = 0
    )