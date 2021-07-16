package cortex.api.job.project.`package`

@SerialVersionUID(0L)
final case class CVTLModelPrimitive(
                                     name: String = "",
                                     description: scala.Option[String] = None,
                                     moduleName: String = "",
                                     className: String = "",
                                     `type`: cortex.api.job.project.`package`.OperatorType = cortex.api.job.project.`package`.OperatorType.UTLP,
                                     params: _root_.scala.collection.Seq[cortex.api.job.project.`package`.OperatorParameter] = _root_.scala.collection.Seq.empty,
                                     isNeural: Boolean = false
                                   )