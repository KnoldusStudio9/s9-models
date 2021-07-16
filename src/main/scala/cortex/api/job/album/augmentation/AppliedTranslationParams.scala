package cortex.api.job.album.augmentation

final case class AppliedTranslationParams(
                                           translateFraction: Float = 0.0f,
                                           mode: cortex.api.job.album.augmentation.TranslationMode = cortex.api.job.album.augmentation.TranslationMode.REFLECT,
                                           resize: Boolean = false
                                         )
