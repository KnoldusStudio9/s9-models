package cortex.api.job.dataset

@SerialVersionUID(0L)
final case class S3DatasetImportResponse(
    datasets: _root_.scala.collection.Seq[cortex.api.job.dataset.UploadedDatasetFile] = _root_.scala.collection.Seq.empty,
    failedFiles: _root_.scala.collection.Seq[cortex.api.job.common.FailedFile] = _root_.scala.collection.Seq.empty
    )