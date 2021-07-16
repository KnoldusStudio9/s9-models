package cortex.api.job.album.uploading

@SerialVersionUID(0L)
final case class InputImage(
    baseImage: scala.Option[cortex.api.job.album.common.Image] = None,
    fileSize: Long = 0L
    )