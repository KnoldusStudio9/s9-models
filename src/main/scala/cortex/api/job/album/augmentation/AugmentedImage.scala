package cortex.api.job.album.augmentation

@SerialVersionUID(0L)
final case class AugmentedImage(
                                 image: scala.Option[cortex.api.job.album.common.TaggedImage] = None,
                                 augmentations: _root_.scala.collection.Seq[cortex.api.job.album.augmentation.AppliedAugmentation] = _root_.scala.collection.Seq.empty,
                                 fileSize: Long = 0L
                               )
