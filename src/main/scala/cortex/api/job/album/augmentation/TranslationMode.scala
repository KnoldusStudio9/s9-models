package cortex.api.job.album.augmentation


sealed trait TranslationMode {
  type EnumType = TranslationMode
  def isReflect: Boolean = false
  def isConstant: Boolean = false
}

object TranslationMode {
  case object REFLECT extends TranslationMode {
    val value = 0
    val index = 0
    val name = "REFLECT"
    override def isReflect: Boolean = true
  }


  case object CONSTANT extends TranslationMode {
    val value = 1
    val index = 1
    val name = "CONSTANT"
    override def isConstant: Boolean = true
  }

  case class Unrecognized(value: Int) extends TranslationMode

  lazy val values = scala.collection.Seq(REFLECT, CONSTANT)
  def fromValue(value: Int): TranslationMode = value match {
    case 0 => REFLECT
    case 1 => CONSTANT
    case __other => Unrecognized(__other)
  }
}