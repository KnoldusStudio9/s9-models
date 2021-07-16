package cortex.api.job.table

@SerialVersionUID(0L)
final case class TabularColumnStatisticsResponse(
                                                  columnStatistics: _root_.scala.collection.Seq[cortex.api.job.table.ColumnStatistics] = _root_.scala.collection.Seq.empty,
                                                  rowCount: Long = 0L
                                                )