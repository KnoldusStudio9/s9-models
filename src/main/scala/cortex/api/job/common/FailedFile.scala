package cortex.api.job.common

@SerialVersionUID(0L)
final case class FailedFile(
    filePath: String = "",
    errorMessage: scala.Option[String] = None,
    referenceId: scala.Option[String] = None
    )