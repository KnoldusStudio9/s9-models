package cortex.api.job.project.`package`

@SerialVersionUID(0L)
final case class IntParameter(
                               values: _root_.scala.collection.Seq[Int] = _root_.scala.collection.Seq.empty,
                               default: _root_.scala.collection.Seq[Int] = _root_.scala.collection.Seq.empty,
                               min: scala.Option[Int] = None,
                               max: scala.Option[Int] = None,
                               step: scala.Option[Int] = None
                             )