package cortex.api.job.project.`package`

sealed trait PrimitiveDataType {
  type EnumType = PrimitiveDataType
  def isString: Boolean = false
  def isInteger: Boolean = false
  def isBoolean: Boolean = false
  def isFloat: Boolean = false
}

object PrimitiveDataType {
  @SerialVersionUID(0L)
  case object String extends PrimitiveDataType {
    val value = 0
    val index = 0
    val name = "String"
    override def isString: Boolean = true
  }

  @SerialVersionUID(0L)
  case object Integer extends PrimitiveDataType {
    val value = 1
    val index = 1
    val name = "Integer"
    override def isInteger: Boolean = true
  }

  @SerialVersionUID(0L)
  case object Boolean extends PrimitiveDataType {
    val value = 2
    val index = 2
    val name = "Boolean"
    override def isBoolean: Boolean = true
  }

  @SerialVersionUID(0L)
  case object Float extends PrimitiveDataType {
    val value = 3
    val index = 3
    val name = "Float"
    override def isFloat: Boolean = true
  }

  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends PrimitiveDataType

  lazy val values = scala.collection.Seq(String, Integer, Boolean, Float)
  def fromValue(value: Int): PrimitiveDataType = value match {
    case 0 => String
    case 1 => Integer
    case 2 => Boolean
    case 3 => Float
    case __other => Unrecognized(__other)
  }
}
