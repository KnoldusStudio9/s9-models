package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class EvaluateResult(
    images: _root_.scala.collection.Seq[cortex.api.job.computervision.PredictedImage] = _root_.scala.collection.Seq.empty,
    confusionMatrix: scala.Option[cortex.api.job.common.ConfusionMatrix] = None,
    map: scala.Option[Double] = None,
    dataFetchTime: Long = 0L,
    loadModelTime: Long = 0L,
    scoreTime: Long = 0L,
    pipelineTimings: scala.collection.immutable.Map[String, Long] = scala.collection.immutable.Map.empty,
    probabilityPredictionTableSchema: scala.Option[cortex.api.job.computervision.ProbabilityPredictionTableSchema] = None
    )