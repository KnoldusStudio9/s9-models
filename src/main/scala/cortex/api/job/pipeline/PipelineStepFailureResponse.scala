package cortex.api.job.pipeline

@SerialVersionUID(0L)
final case class PipelineStepFailureResponse(
                                              pipelineStepGeneralResponse: scala.Option[cortex.api.job.pipeline.PipelineStepGeneralResponse] = None,
                                              errorMessage: scala.Option[String] = None
                                            )