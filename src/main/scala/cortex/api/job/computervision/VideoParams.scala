package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class VideoParams(
    targetVideoFilePath: String = "",
    videoAssembleFrameRate: Double = 0.0,
    videoAssembleHeight: Int = 0,
    videoAssembleWidth: Int = 0
    )