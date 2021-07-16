package cortex.api.job.computervision


@SerialVersionUID(0L)
final case class CVModelTrainResult(
    featureExtractorReference: scala.Option[cortex.api.job.common.ModelReference] = None,
    cvModelReference: scala.Option[cortex.api.job.common.ModelReference] = None,
    images: _root_.scala.collection.Seq[cortex.api.job.computervision.PredictedImage] = _root_.scala.collection.Seq.empty,
    confusionMatrix: scala.Option[cortex.api.job.common.ConfusionMatrix] = None,
    map: scala.Option[Double] = None,
    augmentedImages: _root_.scala.collection.Seq[cortex.api.job.album.augmentation.AugmentedImage] = _root_.scala.collection.Seq.empty,
    augmentationSummary: scala.Option[cortex.api.job.album.augmentation.AugmentationSummary] = None,
    dataFetchTime: Long = 0L,
    trainingTime: Long = 0L,
    saveModelTime: Long = 0L,
    predictionTime: Long = 0L,
    reconstructionLoss: scala.Option[Double] = None,
    pipelineTimings: scala.collection.immutable.Map[String, Long] = scala.collection.immutable.Map.empty,
    probabilityPredictionTableSchema: scala.Option[cortex.api.job.computervision.ProbabilityPredictionTableSchema] = None
    )