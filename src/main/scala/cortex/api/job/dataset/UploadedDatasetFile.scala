package cortex.api.job.dataset

@SerialVersionUID(0L)
final case class UploadedDatasetFile(
    file: scala.Option[cortex.api.job.common.File] = None,
    metadata: scala.collection.immutable.Map[String, String] = scala.collection.immutable.Map.empty
    )