package cortex.api.job.tabular

final case class TabularModelImportRequest(
    path: String = "",
    modelClassReference: scala.Option[cortex.api.job.common.ClassReference] = None
    )