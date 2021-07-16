package cortex.api.job.album.augmentation

@SerialVersionUID(0L)
final case class TranslationRequestParams(
                                           translateFractions: _root_.scala.collection.Seq[Float] = _root_.scala.collection.Seq.empty,
                                           mode: cortex.api.job.album.augmentation.TranslationMode = cortex.api.job.album.augmentation.TranslationMode.REFLECT,
                                           resize: Boolean = false
                                         )
