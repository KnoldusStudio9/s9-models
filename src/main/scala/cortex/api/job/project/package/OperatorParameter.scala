package cortex.api.job.project.`package`

@SerialVersionUID(0L)
final case class OperatorParameter(
                                    name: String = "",
                                    description: scala.Option[String] = None,
                                    multiple: Boolean = false,
                                    conditions: scala.collection.immutable.Map[String, cortex.api.job.project.`package`.ParameterCondition] = scala.collection.immutable.Map.empty,
                                    typeInfo: TypeInfo = TypeInfo.Empty
                                  )