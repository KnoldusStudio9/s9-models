package cortex.api.job.tabular

sealed trait ModelType {
  type EnumType = ModelType
  def isRegression: Boolean = false
  def isBinary: Boolean = false
  def isMulticlass: Boolean = false
}

object ModelType {
  @SerialVersionUID(0L)
  case object REGRESSION extends ModelType {
    val value = 0
    val index = 0
    val name = "REGRESSION"
    override def isRegression: Boolean = true
  }

  @SerialVersionUID(0L)
  case object BINARY extends ModelType {
    val value = 1
    val index = 1
    val name = "BINARY"
    override def isBinary: Boolean = true
  }

  @SerialVersionUID(0L)
  case object MULTICLASS extends ModelType {
    val value = 2
    val index = 2
    val name = "MULTICLASS"
    override def isMulticlass: Boolean = true
  }

  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends ModelType
  lazy val values = scala.collection.Seq(REGRESSION, BINARY, MULTICLASS)
  def fromValue(value: Int): ModelType = value match {
    case 0 => REGRESSION
    case 1 => BINARY
    case 2 => MULTICLASS
    case __other => Unrecognized(__other)
  }
}
