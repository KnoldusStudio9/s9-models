package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class AutoAugmentationParams(
    augmentations: _root_.scala.collection.Seq[cortex.api.job.album.augmentation.RequestedAugmentation] = _root_.scala.collection.Seq.empty,
    bloatFactor: scala.Option[Int] = None,
    generateSampleAlbum: Boolean = false,
    sampleAlbumTargetPrefix: scala.Option[String] = None
    )