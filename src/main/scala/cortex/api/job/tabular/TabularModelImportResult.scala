package cortex.api.job.tabular

final case class TabularModelImportResult(
   tabularModelReference: scala.Option[cortex.api.job.common.ModelReference] = None
   )