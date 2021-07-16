package cortex.api.job.pipeline

@SerialVersionUID(0L)
final case class PipelineOutputReference(
                                          stepId: String = "",
                                          outputIndex: Int = 0
                                        )