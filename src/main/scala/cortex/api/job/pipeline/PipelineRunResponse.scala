package cortex.api.job.pipeline

@SerialVersionUID(0L)
final case class PipelineRunResponse(
                                      pipelineStepsResponse: _root_.scala.collection.Seq[cortex.api.job.pipeline.PipelineStepResponse] = _root_.scala.collection.Seq.empty
                                    )