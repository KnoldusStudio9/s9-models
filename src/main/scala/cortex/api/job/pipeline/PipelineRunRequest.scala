package cortex.api.job.pipeline

@SerialVersionUID(0L)
final case class PipelineRunRequest(
                                     pipelineStepsRequest: _root_.scala.collection.Seq[cortex.api.job.pipeline.PipelineStepRequest] = _root_.scala.collection.Seq.empty,
                                     baileAuthToken: String = ""
                                   )