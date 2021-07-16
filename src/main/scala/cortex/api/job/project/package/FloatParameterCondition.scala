package cortex.api.job.project.`package`

@SerialVersionUID(0L)
final case class FloatParameterCondition(
                                          values: _root_.scala.collection.Seq[Float] = _root_.scala.collection.Seq.empty,
                                          min: scala.Option[Float] = None,
                                          max: scala.Option[Float] = None
                                        )