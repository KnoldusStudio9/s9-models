package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class CVModelImportResult(
    featureExtractorReference: scala.Option[cortex.api.job.common.ModelReference] = None,
    cvModelReference: scala.Option[cortex.api.job.common.ModelReference] = None
    )