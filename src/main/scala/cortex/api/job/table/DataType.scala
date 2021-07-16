package cortex.api.job.table

sealed trait DataType{
  type EnumType = DataType
  def isString: Boolean = false
  def isInteger: Boolean = false
  def isDouble: Boolean = false
  def isBoolean: Boolean = false
  def isTimestamp: Boolean = false
  def isLong: Boolean = false
}

object DataType {
  @SerialVersionUID(0L)
  case object STRING extends DataType {
    val value = 0
    val index = 0
    val name = "STRING"
    override def isString: Boolean = true
  }

  @SerialVersionUID(0L)
  case object INTEGER extends DataType {
    val value = 1
    val index = 1
    val name = "INTEGER"
    override def isInteger: Boolean = true
  }

  @SerialVersionUID(0L)
  case object DOUBLE extends DataType {
    val value = 2
    val index = 2
    val name = "DOUBLE"
    override def isDouble: Boolean = true
  }

  @SerialVersionUID(0L)
  case object BOOLEAN extends DataType {
    val value = 3
    val index = 3
    val name = "BOOLEAN"
    override def isBoolean: Boolean = true
  }

  @SerialVersionUID(0L)
  case object TIMESTAMP extends DataType {
    val value = 4
    val index = 4
    val name = "TIMESTAMP"
    override def isTimestamp: Boolean = true
  }

  @SerialVersionUID(0L)
  case object LONG extends DataType {
    val value = 5
    val index = 5
    val name = "LONG"
    override def isLong: Boolean = true
  }

  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends DataType

  lazy val values = scala.collection.Seq(STRING, INTEGER, DOUBLE, BOOLEAN, TIMESTAMP, LONG)
  def fromValue(value: Int): DataType = value match {
    case 0 => STRING
    case 1 => INTEGER
    case 2 => DOUBLE
    case 3 => BOOLEAN
    case 4 => TIMESTAMP
    case 5 => LONG
    case __other => Unrecognized(__other)
  }
}
