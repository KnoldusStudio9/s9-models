package cortex.api.job.project.`package`

@SerialVersionUID(0L)
final case class PipelineOperator(
                                   moduleName: String = "",
                                   className: String = "",
                                   inputs: _root_.scala.collection.Seq[cortex.api.job.project.`package`.PipelineOperatorInput] = _root_.scala.collection.Seq.empty,
                                   outputs: _root_.scala.collection.Seq[cortex.api.job.project.`package`.PipelineOperatorOutput] = _root_.scala.collection.Seq.empty,
                                   params: _root_.scala.collection.Seq[cortex.api.job.project.`package`.OperatorParameter] = _root_.scala.collection.Seq.empty,
                                   description: scala.Option[String] = None,
                                   name: String = ""
                                 )