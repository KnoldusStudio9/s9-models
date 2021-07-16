package cortex.api.job.online.prediction

@SerialVersionUID(0L)
final case class PredictResponse(
    images: _root_.scala.collection.Seq[cortex.api.job.online.prediction.LabledImage] = _root_.scala.collection.Seq.empty,
    failedFiles: _root_.scala.collection.Seq[cortex.api.job.common.FailedFile] = _root_.scala.collection.Seq.empty,
    s3ResultsCsvPath: String = ""
    )