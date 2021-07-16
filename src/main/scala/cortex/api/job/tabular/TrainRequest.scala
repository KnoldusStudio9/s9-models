package cortex.api.job.tabular

@SerialVersionUID(0L)
final case class TrainRequest(
     input: scala.Option[cortex.api.job.table.DataSource] = None,
     predictors: _root_.scala.collection.Seq[cortex.api.job.table.TableColumn] = _root_.scala.collection.Seq.empty,
     response: scala.Option[cortex.api.job.table.TableColumn] = None,
     weight: scala.Option[cortex.api.job.table.TableColumn] = None,
     output: scala.Option[cortex.api.job.table.DataSource] = None,
     dropPreviousResultTable: Boolean = false,
     predictionResultColumnName: String = "",
     probabilityColumnsPrefix: scala.Option[String] = None
     )