package cortex.api.job.album.augmentation

final case class AppliedAugmentation(
                                      extraParams: scala.collection.immutable.Map[String, Float] = scala.collection.immutable.Map.empty,
                                      internalParams: scala.collection.immutable.Map[String, Float] = scala.collection.immutable.Map.empty,
                                      generalParams: cortex.api.job.album.augmentation.GeneralParams = cortex.api.job.album.augmentation.GeneralParams.Empty
                                    )
