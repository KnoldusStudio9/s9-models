package cortex.api.job.project.`package`

@SerialVersionUID(0L)
final case class PipelineOperatorInput(
                                        name: String = "",
                                        description: scala.Option[String] = None,
                                        `type`: scala.Option[cortex.api.job.project.`package`.PipelineDataType] = None,
                                        covariate: Boolean = false,
                                        required: Boolean = false
                                      )