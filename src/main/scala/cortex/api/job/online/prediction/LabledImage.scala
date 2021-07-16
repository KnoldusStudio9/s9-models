package cortex.api.job.online.prediction

@SerialVersionUID(0L)
final case class LabledImage(
    filePath: String = "",
    fileSize: Long = 0L,
    fileName: String = "",
    metadata: scala.collection.immutable.Map[String, String] = scala.collection.immutable.Map.empty,
    label: String = "",
    confidence: Double = 0.0
    )