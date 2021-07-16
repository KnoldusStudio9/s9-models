package cortex.api.job.album.augmentation

@SerialVersionUID(0L)
final case class OcclusionRequestParams(
                                         occAreaFractions: _root_.scala.collection.Seq[Float] = _root_.scala.collection.Seq.empty,
                                         mode: cortex.api.job.album.augmentation.OcclusionMode = cortex.api.job.album.augmentation.OcclusionMode.BACKGROUND,
                                         isSarAlbum: Boolean = false,
                                         tarWinSize: Int = 0
                                       )
