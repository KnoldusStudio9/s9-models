package cortex.api.job.project.`package`

@SerialVersionUID(0L)
final case class ProjectPackageResponse(
                                         packageLocation: String = "",
                                         cvTlModelPrimitives: _root_.scala.collection.Seq[cortex.api.job.project.`package`.CVTLModelPrimitive] = _root_.scala.collection.Seq.empty,
                                         pipelineOperators: _root_.scala.collection.Seq[cortex.api.job.project.`package`.PipelineOperator] = _root_.scala.collection.Seq.empty
                                       )