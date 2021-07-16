package cortex.api.job.table

sealed trait FileType {
  type EnumType = FileType
  def isCsv: Boolean = false
  def isJson: Boolean = false
}

object FileType {
  @SerialVersionUID(0L)
  case object CSV extends FileType {
    val value = 0
    val index = 0
    val name = "CSV"
    override def isCsv: Boolean = true
  }

  @SerialVersionUID(0L)
  case object JSON extends FileType {
    val value = 1
    val index = 1
    val name = "JSON"
    override def isJson: Boolean = true
  }

  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends FileType

  lazy val values = scala.collection.Seq(CSV, JSON)
  def fromValue(value: Int): FileType = value match {
    case 0 => CSV
    case 1 => JSON
    case __other => Unrecognized(__other)
  }
}