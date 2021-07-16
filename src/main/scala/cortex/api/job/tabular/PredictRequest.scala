package cortex.api.job.tabular

final case class PredictRequest(
    modelId: String = "",
    input: scala.Option[cortex.api.job.table.DataSource] = None,
    output: scala.Option[cortex.api.job.table.DataSource] = None,
    predictors: _root_.scala.collection.Seq[cortex.api.job.tabular.ColumnMapping] = _root_.scala.collection.Seq.empty,
    dropPreviousResultTable: Boolean = false,
    predictionResultColumnName: String = "",
    probabilityColumns: _root_.scala.collection.Seq[cortex.api.job.table.ProbabilityClassColumn] = _root_.scala.collection.Seq.empty,
    modelReference: scala.Option[cortex.api.job.common.ClassReference] = None
    )