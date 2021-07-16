package cortex.api.job.album.augmentation


sealed trait MirroringAxisToFlip {
  type EnumType = MirroringAxisToFlip
  def isHorizontal: Boolean = false
  def isVertical: Boolean = false
  def isBoth: Boolean = false
}

object MirroringAxisToFlip{

  case object HORIZONTAL extends MirroringAxisToFlip {
    val value = 0
    val index = 0
    val name = "HORIZONTAL"
    override def isHorizontal: Boolean = true
  }

  @SerialVersionUID(0L)
  case object VERTICAL extends MirroringAxisToFlip {
    val value = 1
    val index = 1
    val name = "VERTICAL"
    override def isVertical: Boolean = true
  }

  @SerialVersionUID(0L)
  case object BOTH extends MirroringAxisToFlip {
    val value = 2
    val index = 2
    val name = "BOTH"
    override def isBoth: Boolean = true
  }

  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends MirroringAxisToFlip
  lazy val values = scala.collection.Seq(HORIZONTAL, VERTICAL, BOTH)
  def fromValue(value: Int): MirroringAxisToFlip = value match {
    case 0 => HORIZONTAL
    case 1 => VERTICAL
    case 2 => BOTH
    case __other => Unrecognized(__other)
  }
}