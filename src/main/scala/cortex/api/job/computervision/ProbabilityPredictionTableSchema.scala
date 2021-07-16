package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class ProbabilityPredictionTableSchema(
    probabilityColumns: _root_.scala.collection.Seq[cortex.api.job.table.ProbabilityClassColumn] = _root_.scala.collection.Seq.empty,
    imageFileNameColumnName: String = "",
    areaColumns: scala.Option[cortex.api.job.computervision.ProbabilityPredictionAreaColumns] = None
    )