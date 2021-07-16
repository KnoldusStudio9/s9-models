package cortex.api.job.tabular

final case class PredictionResult(
    classProbabilityColumnNames: _root_.scala.collection.Seq[String] = _root_.scala.collection.Seq.empty,
    output: scala.Option[cortex.api.job.table.DataSource] = None
    )