package cortex.api.job.album.augmentation

final case class AppliedOcclusionParams(
                                         occAreaFraction: Float = 0.0f,
                                         mode: cortex.api.job.album.augmentation.OcclusionMode = cortex.api.job.album.augmentation.OcclusionMode.BACKGROUND,
                                         isSarAlbum: Boolean = false,
                                         tarWinSize: Int = 0
                                       )