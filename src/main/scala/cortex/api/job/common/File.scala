package cortex.api.job.common

@SerialVersionUID(0L)
final case class File(
    filePath: String = "",
    fileSize: Long = 0L,
    fileName: String = ""
    )