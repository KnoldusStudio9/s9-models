package cortex.api.job.album.augmentation

@SerialVersionUID(0L)
final case class SaltPepperRequestParams(
                                          knockoutFractions: _root_.scala.collection.Seq[Float] = _root_.scala.collection.Seq.empty,
                                          pepperProbability: Float = 0.0f
                                        )
