package cortex.api.job.project.`package`

sealed trait OperatorType {
  type EnumType = OperatorType
  def isUtlp: Boolean = false
  def isClassifier: Boolean = false
  def isDetector: Boolean = false
}

object OperatorType {
  @SerialVersionUID(0L)
  case object UTLP extends OperatorType {
    val value = 0
    val index = 0
    val name = "UTLP"
    override def isUtlp: Boolean = true
  }

  @SerialVersionUID(0L)
  case object Classifier extends OperatorType {
    val value = 1
    val index = 1
    val name = "Classifier"
    override def isClassifier: Boolean = true
  }

  @SerialVersionUID(0L)
  case object Detector extends OperatorType {
    val value = 2
    val index = 2
    val name = "Detector"
    override def isDetector: Boolean = true
  }

  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends OperatorType

  lazy val values = scala.collection.Seq(UTLP, Classifier, Detector)
  def fromValue(value: Int): OperatorType = value match {
    case 0 => UTLP
    case 1 => Classifier
    case 2 => Detector
    case __other => Unrecognized(__other)
  }
}
