package cortex.api.job.common

@SerialVersionUID(0L)
final case class ConfusionMatrixCell(
    actualLabelIndex: scala.Option[Int] = None,
    predictedLabelIndex: scala.Option[Int] = None,
    value: Int = 0
    )