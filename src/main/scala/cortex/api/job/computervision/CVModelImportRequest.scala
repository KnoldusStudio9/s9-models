package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class CVModelImportRequest(
    path: String = "",
    modelType: scala.Option[cortex.api.job.computervision.CVModelType] = None,
    feOnly: Boolean = false
    )