package cortex.api.job.album.augmentation


sealed trait OcclusionMode{
  type EnumType = OcclusionMode
  def isBackground: Boolean = false
  def isZero: Boolean = false
}

object OcclusionMode {
  case object BACKGROUND extends OcclusionMode {
    val value = 0
    val index = 0
    val name = "BACKGROUND"
    override def isBackground: Boolean = true
  }

  case object ZERO extends OcclusionMode {
    val value = 1
    val index = 1
    val name = "ZERO"
    override def isZero: Boolean = true
  }

  case class Unrecognized(value: Int) extends OcclusionMode

  lazy val values = scala.collection.Seq(BACKGROUND, ZERO)
  def fromValue(value: Int): OcclusionMode = value match {
    case 0 => BACKGROUND
    case 1 => ZERO
    case __other => Unrecognized(__other)
  }
}