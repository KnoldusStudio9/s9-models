package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class PredictResult(
    images: _root_.scala.collection.Seq[cortex.api.job.computervision.PredictedImage] = _root_.scala.collection.Seq.empty,
    videoFileSize: scala.Option[Long] = None,
    dataFetchTime: Long = 0L,
    loadModelTime: Long = 0L,
    predictionTime: Long = 0L,
    pipelineTimings: scala.collection.immutable.Map[String, Long] = scala.collection.immutable.Map.empty,
    probabilityPredictionTableSchema: scala.Option[cortex.api.job.computervision.ProbabilityPredictionTableSchema] = None
    )