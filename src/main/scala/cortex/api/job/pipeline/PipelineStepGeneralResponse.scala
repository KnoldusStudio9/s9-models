package cortex.api.job.pipeline

@SerialVersionUID(0L)
final case class PipelineStepGeneralResponse(
                                              stepId: String = "",
                                              trackedAssetReferences: _root_.scala.collection.Seq[cortex.api.job.pipeline.TrackedAssetReference] = _root_.scala.collection.Seq.empty,
                                              summaries: _root_.scala.collection.Seq[cortex.api.job.pipeline.OperatorApplicationSummary] = _root_.scala.collection.Seq.empty,
                                              outputValues: scala.collection.immutable.Map[Int, cortex.api.job.pipeline.PipelineValue] = scala.collection.immutable.Map.empty,
                                              stepExecutionTime: Long = 0L
                                            )