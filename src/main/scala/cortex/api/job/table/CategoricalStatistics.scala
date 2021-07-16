package cortex.api.job.table

@SerialVersionUID(0L)
final case class CategoricalStatistics(
   uniqueValuesCount: Long = 0L,
   histogram: scala.Option[cortex.api.job.table.CategoricalHistogram] = None
   )