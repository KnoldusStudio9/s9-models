package cortex.api.job.computervision

sealed trait Code{
  type EnumType = Code
  def isDeleted: Boolean = false
  def isNotFound: Boolean = false
  def isBeingUsed: Boolean = false
}

object Code{
  @SerialVersionUID(0L)
  case object DELETED extends Code {
    val value = 0
    val index = 0
    val name = "DELETED"
    override def isDeleted: Boolean = true
  }

  @SerialVersionUID(0L)
  case object NOT_FOUND extends Code {
    val value = 1
    val index = 1
    val name = "NOT_FOUND"
    override def isNotFound: Boolean = true
  }

  @SerialVersionUID(0L)
  case object BEING_USED extends Code {
    val value = 2
    val index = 2
    val name = "BEING_USED"
    override def isBeingUsed: Boolean = true
  }

  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends Code
  lazy val values = scala.collection.Seq(DELETED, NOT_FOUND, BEING_USED)
  def fromValue(value: Int): Code = value match {
    case 0 => DELETED
    case 1 => NOT_FOUND
    case 2 => BEING_USED
    case __other => Unrecognized(__other)
  }
}