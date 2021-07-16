package cortex.api.job.album.uploading

@SerialVersionUID(0L)
final case class S3ImagesImportResult(
    images: _root_.scala.collection.Seq[cortex.api.job.album.uploading.UploadedImage] = _root_.scala.collection.Seq.empty,
    failedFiles: _root_.scala.collection.Seq[cortex.api.job.common.FailedFile] = _root_.scala.collection.Seq.empty
    )