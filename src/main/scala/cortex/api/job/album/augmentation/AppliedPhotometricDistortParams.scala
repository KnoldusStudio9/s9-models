package cortex.api.job.album.augmentation

final case class AppliedPhotometricDistortParams(
                                                  deltaMax: Float = 0.0f,
                                                  alphaConstant: Float = 0.0f,
                                                  alphaSaturation: Float = 0.0f,
                                                  deltaHue: Float = 0.0f
                                                )
