package cortex.api.job.album.augmentation

@SerialVersionUID(0L)
final case class RequestedAugmentation(
                                        bloatFactor: Int = 0,
                                        params: cortex.api.job.album.augmentation.Params = cortex.api.job.album.augmentation.Params.Empty
                                      )
