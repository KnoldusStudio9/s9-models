package cortex.api.job.table

final case class DataSource(
                             table: scala.Option[cortex.api.job.table.Table] = None
                           )
