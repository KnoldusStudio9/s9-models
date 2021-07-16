package cortex.api.job.computervision

@SerialVersionUID(0L)
final case class LabelOfInterest(
    label: String = "",
    threshold: Double = 0.0
    )