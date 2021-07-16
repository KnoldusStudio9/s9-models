package cortex.api.job.table

@SerialVersionUID(0L)
final case class TabularColumnStatisticsRequest(
                                                 dataSource: scala.Option[cortex.api.job.table.DataSource] = None,
                                                 columns: _root_.scala.collection.Seq[cortex.api.job.table.Column] = _root_.scala.collection.Seq.empty,
                                                 histogramLength: Int = 0
                                               )