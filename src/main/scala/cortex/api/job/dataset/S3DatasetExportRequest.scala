package cortex.api.job.dataset

@SerialVersionUID(0L)
final case class S3DatasetExportRequest(
    bucketName: String = "",
    awsRegion: String = "",
    awsAccessKey: scala.Option[String] = None,
    awsSecretKey: scala.Option[String] = None,
    awsSessionToken: scala.Option[String] = None,
    datasetPath: String = "",
    targetPrefix: String = ""
    )