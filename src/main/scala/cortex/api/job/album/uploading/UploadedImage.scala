package cortex.api.job.album.uploading

@SerialVersionUID(0L)
final case class UploadedImage(
    file: scala.Option[cortex.api.job.common.File] = None,
    tags: _root_.scala.collection.Seq[cortex.api.job.album.common.Tag] = _root_.scala.collection.Seq.empty,
    metadata: scala.collection.immutable.Map[String, String] = scala.collection.immutable.Map.empty,
    referenceId: scala.Option[String] = None
    )