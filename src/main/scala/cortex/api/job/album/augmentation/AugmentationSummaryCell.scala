package cortex.api.job.album.augmentation

@SerialVersionUID(0L)
final case class AugmentationSummaryCell(
                                          requestedAugmentation: scala.Option[cortex.api.job.album.augmentation.RequestedAugmentation] = None,
                                          imagesCount: Long = 0L
                                        )
