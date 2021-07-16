package cortex.api.job.album.uploading

@SerialVersionUID(0L)
final case class S3VideoImportResult(
    imageFiles: _root_.scala.collection.Seq[cortex.api.job.common.File] = _root_.scala.collection.Seq.empty,
    videoFile: scala.Option[cortex.api.job.common.File] = None,
    videoFrameRate: Int = 0,
    videoHeight: Int = 0,
    videoWidth: Int = 0
    )