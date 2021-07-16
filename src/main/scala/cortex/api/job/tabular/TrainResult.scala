package cortex.api.job.tabular

@SerialVersionUID(0L)
final case class TrainResult(
   modelId: String = "",
   modelType: cortex.api.job.tabular.ModelType = cortex.api.job.tabular.ModelType.REGRESSION,
   formula: String = "",
   predictorsSummary: _root_.scala.collection.Seq[cortex.api.job.tabular.PredictorSummary] = _root_.scala.collection.Seq.empty,
   probabilityColumns: _root_.scala.collection.Seq[cortex.api.job.table.ProbabilityClassColumn] = _root_.scala.collection.Seq.empty,
   output: scala.Option[cortex.api.job.table.DataSource] = None,
   modelPrimitive: String = "",
   modelFilePath: String = "",
   summary: Summary = Summary.Empty
   )