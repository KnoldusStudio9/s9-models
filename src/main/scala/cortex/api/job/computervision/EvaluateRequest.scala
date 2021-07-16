package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class EvaluateRequest(
    modelType: scala.Option[cortex.api.job.computervision.CVModelType] = None,
    modelId: String = "",
    images: _root_.scala.collection.Seq[cortex.api.job.album.common.TaggedImage] = _root_.scala.collection.Seq.empty,
    filePathPrefix: String = "",
    labelsOfInterest: _root_.scala.collection.Seq[cortex.api.job.computervision.LabelOfInterest] = _root_.scala.collection.Seq.empty,
    probabilityPredictionTable: scala.Option[cortex.api.job.table.TableMeta] = None,
    defaultVisualThreshold: scala.Option[Double] = None,
    iouThreshold: scala.Option[Double] = None
    )