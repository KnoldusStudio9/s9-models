package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class CVModelTrainRequest(
    featureExtractorId: scala.Option[String] = None,
    featureExtractorClassReference: scala.Option[cortex.api.job.common.ClassReference] = None,
    images: _root_.scala.collection.Seq[cortex.api.job.album.common.TaggedImage] = _root_.scala.collection.Seq.empty,
    filePathPrefix: String = "",
    modelType: scala.Option[cortex.api.job.computervision.TLModelType] = None,
    augmentationParams: scala.Option[cortex.api.job.computervision.AutoAugmentationParams] = None,
    tuneFeatureExtractor: Boolean = false,
    featureExtractorParameters: scala.collection.immutable.Map[String, cortex.api.job.computervision.ParameterValue] = scala.collection.immutable.Map.empty,
    modelParameters: scala.collection.immutable.Map[String, cortex.api.job.computervision.ParameterValue] = scala.collection.immutable.Map.empty,
    probabilityPredictionTable: scala.Option[cortex.api.job.table.TableMeta] = None,
    inputSize: scala.Option[cortex.api.job.computervision.InputSize] = None,
    labelsOfInterest: _root_.scala.collection.Seq[cortex.api.job.computervision.LabelOfInterest] = _root_.scala.collection.Seq.empty,
    defaultVisualThreshold: scala.Option[Double] = None,
    iouThreshold: scala.Option[Double] = None,
    featureExtractorLearningRate: scala.Option[Double] = None,
    modelLearningRate: scala.Option[Double] = None
    )