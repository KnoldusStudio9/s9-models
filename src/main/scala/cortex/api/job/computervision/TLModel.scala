package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class TLModel(
    modelType: scala.Option[cortex.api.job.computervision.TLModelType] = None,
    featureExtractorClassReference: scala.Option[cortex.api.job.common.ClassReference] = None
    )