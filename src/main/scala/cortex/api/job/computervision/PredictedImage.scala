package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class PredictedImage(
    image: scala.Option[cortex.api.job.album.common.Image] = None,
    predictedTags: _root_.scala.collection.Seq[cortex.api.job.computervision.PredictedTag] = _root_.scala.collection.Seq.empty
    )