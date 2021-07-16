package cortex.api.job.tabular

final case class ClassificationSummary(
   confusionMatrix: _root_.scala.collection.Seq[cortex.api.job.tabular.ClassConfusion] = _root_.scala.collection.Seq.empty
   )
