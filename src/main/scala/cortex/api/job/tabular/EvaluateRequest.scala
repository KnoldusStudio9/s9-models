package cortex.api.job.tabular

final case class EvaluateRequest(
   modelId: String = "",
   input: scala.Option[cortex.api.job.table.DataSource] = None,
   predictors: _root_.scala.collection.Seq[cortex.api.job.tabular.ColumnMapping] = _root_.scala.collection.Seq.empty,
   response: scala.Option[cortex.api.job.tabular.ColumnMapping] = None,
   weight: scala.Option[cortex.api.job.tabular.ColumnMapping] = None,
   output: scala.Option[cortex.api.job.table.DataSource] = None,
   dropPreviousResultTable: Boolean = false,
   predictionResultColumnName: String = "",
   probabilityColumns: _root_.scala.collection.Seq[cortex.api.job.table.ProbabilityClassColumn] = _root_.scala.collection.Seq.empty,
   modelReference: scala.Option[cortex.api.job.common.ClassReference] = None
   )

