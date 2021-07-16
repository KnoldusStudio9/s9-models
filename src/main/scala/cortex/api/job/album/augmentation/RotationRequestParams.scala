package cortex.api.job.album.augmentation

@SerialVersionUID(0L)
final case class RotationRequestParams(
                                        angles: _root_.scala.collection.Seq[Float] = _root_.scala.collection.Seq.empty,
                                        resize: Boolean = false
                                      )
