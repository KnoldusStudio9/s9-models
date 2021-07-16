package cortex.api.job.tabular

final case class BinaryClassificationTrainSummary(
  areaUnderRoc: Double = 0.0,
  rocValues: _root_.scala.collection.Seq[cortex.api.job.tabular.RocValue] = _root_.scala.collection.Seq.empty,
  f1Score: Double = 0.0,
  precision: Double = 0.0,
  recall: Double = 0.0,
  threshold: Double = 0.0,
  binaryClassificationEvalSummary: scala.Option[cortex.api.job.tabular.BinaryClassificationEvalSummary] = None
  )
