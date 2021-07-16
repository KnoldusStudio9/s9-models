package cortex.api.job.table

sealed trait VariableType {
  type EnumType = VariableType
  def isContinuous: Boolean = false
  def isCategorical: Boolean = false
}

object VariableType {
  @SerialVersionUID(0L)
  case object CONTINUOUS extends VariableType {
    val value = 0
    val index = 0
    val name = "CONTINUOUS"
    override def isContinuous: Boolean = true
  }

  @SerialVersionUID(0L)
  case object CATEGORICAL extends VariableType {
    val value = 1
    val index = 1
    val name = "CATEGORICAL"
    override def isCategorical: Boolean = true
  }

  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends VariableType

  lazy val values = scala.collection.Seq(CONTINUOUS, CATEGORICAL)
  def fromValue(value: Int): VariableType = value match {
    case 0 => CONTINUOUS
    case 1 => CATEGORICAL
    case __other => Unrecognized(__other)
  }
}
