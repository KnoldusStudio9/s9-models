package cortex.api.job.album.augmentation


@SerialVersionUID(0L)
final case class PhotometricDistortRequestParams(
                                                  alphaBounds: scala.Option[cortex.api.job.album.augmentation.PhotometricDistortAlphaBounds] = None,
                                                  deltaMax: Float = 0.0f
                                                )
