package cortex.api.job.project.`package`

@SerialVersionUID(0L)
final case class ComplexDataType(
                                  definition: String = "",
                                  parents: _root_.scala.collection.Seq[cortex.api.job.project.`package`.ComplexDataType] = _root_.scala.collection.Seq.empty,
                                  typeArguments: _root_.scala.collection.Seq[cortex.api.job.project.`package`.PipelineDataType] = _root_.scala.collection.Seq.empty
                                )