package cortex.api.job.album.uploading

@SerialVersionUID(0L)
final case class S3ImagesImportRequest(
                                        bucketName: String = "",
                                        awsRegion: String = "",
                                        awsAccessKey: String = "",
                                        awsSecretKey: String = "",
                                        awsSessionToken: String = "",
                                        imagesPath: String = "",
                                        labelsCsvPath: String = "",
                                        labelsCsvFile: String = "",
                                        targetPrefix: String = "",
                                        images: _root_.scala.collection.Seq[cortex.api.job.album.uploading.InputImage] = _root_.scala.collection.Seq.empty,
                                        labelMode: cortex.api.job.album.uploading.AlbumLabelMode = cortex.api.job.album.uploading.AlbumLabelMode.CLASSIFICATION,
                                        applyLogTransformation: Boolean = false
    )