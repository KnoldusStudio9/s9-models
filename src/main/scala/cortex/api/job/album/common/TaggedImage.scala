package cortex.api.job.album.common


@SerialVersionUID(0L)
final case class TaggedImage(
                              image: scala.Option[cortex.api.job.album.common.Image] = None,
                              tags: _root_.scala.collection.Seq[cortex.api.job.album.common.Tag] = _root_.scala.collection.Seq.empty
                            )
