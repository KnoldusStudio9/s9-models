package cortex.api.job.album.augmentation


@SerialVersionUID(0L)
final case class CroppingRequestParams(
                                        cropAreaFractions: _root_.scala.collection.Seq[Float] = _root_.scala.collection.Seq.empty,
                                        cropsPerImage: Int = 0,
                                        resize: Boolean = false
                                      )
