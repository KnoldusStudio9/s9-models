package cortex.api.job.album.augmentation

@SerialVersionUID(0L)
final case class AugmentationRequest(
                                      images: _root_.scala.collection.Seq[cortex.api.job.album.common.TaggedImage] = _root_.scala.collection.Seq.empty,
                                      filePathPrefix: String = "",
                                      augmentations: _root_.scala.collection.Seq[cortex.api.job.album.augmentation.RequestedAugmentation] = _root_.scala.collection.Seq.empty,
                                      bloatFactor: scala.Option[Int] = None,
                                      targetPrefix: String = "",
                                      includeOriginalImages: Boolean = false
                                    )
