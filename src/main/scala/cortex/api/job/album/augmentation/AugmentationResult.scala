package cortex.api.job.album.augmentation

@SerialVersionUID(0L)
final case class AugmentationResult(
                                     originalImages: _root_.scala.collection.Seq[cortex.api.job.album.common.TaggedImage] = _root_.scala.collection.Seq.empty,
                                     augmentedImages: _root_.scala.collection.Seq[cortex.api.job.album.augmentation.AugmentedImage] = _root_.scala.collection.Seq.empty,
                                     dataFetchTime: Long = 0L,
                                     augmentationTime: Long = 0L,
                                     pipelineTimings: scala.collection.immutable.Map[String, Long] = scala.collection.immutable.Map.empty
                                   )