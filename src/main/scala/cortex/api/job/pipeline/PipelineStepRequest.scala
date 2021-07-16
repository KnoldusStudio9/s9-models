package cortex.api.job.pipeline

@SerialVersionUID(0L)
final case class PipelineStepRequest(
                                      stepId: String = "",
                                      operator: scala.Option[cortex.api.job.common.ClassReference] = None,
                                      inputs: scala.collection.immutable.Map[String, cortex.api.job.pipeline.PipelineOutputReference] = scala.collection.immutable.Map.empty,
                                      params: scala.collection.immutable.Map[String, cortex.api.job.pipeline.PipelineParam] = scala.collection.immutable.Map.empty
                                    )