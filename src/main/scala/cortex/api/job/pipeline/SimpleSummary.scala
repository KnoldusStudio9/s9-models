package cortex.api.job.pipeline

@SerialVersionUID(0L)
final case class SimpleSummary(
                                values: scala.collection.immutable.Map[String, cortex.api.job.pipeline.PipelineValue] = scala.collection.immutable.Map.empty
                              )