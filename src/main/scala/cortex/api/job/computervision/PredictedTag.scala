package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class PredictedTag(
    tag: scala.Option[cortex.api.job.album.common.Tag] = None,
    confidence: Double = 0.0
    )