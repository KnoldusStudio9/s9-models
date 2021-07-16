package cortex.api.job.online.prediction

@SerialVersionUID(0L)
final case class PredictRequest(
    bucketName: String = "",
    awsRegion: String = "",
    awsAccessKey: String = "",
    awsSecretKey: String = "",
    awsSessionToken: String = "",
    images: _root_.scala.collection.Seq[cortex.api.job.online.prediction.Image] = _root_.scala.collection.Seq.empty,
    targetPrefix: String = "",
    modelId: String = ""
    )