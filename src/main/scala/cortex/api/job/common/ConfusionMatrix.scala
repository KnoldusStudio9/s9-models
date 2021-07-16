package cortex.api.job.common

@SerialVersionUID(0L)
final case class ConfusionMatrix(
    confusionMatrixCells: _root_.scala.collection.Seq[cortex.api.job.common.ConfusionMatrixCell] = _root_.scala.collection.Seq.empty,
    labels: _root_.scala.collection.Seq[String] = _root_.scala.collection.Seq.empty
    )