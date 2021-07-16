package cortex.api.job.album.uploading

sealed trait AlbumLabelMode{
  type EnumType = AlbumLabelMode
  def isClassification: Boolean = false
  def isLocalization: Boolean = false
}

object AlbumLabelMode {
  @SerialVersionUID(0L)
  case object CLASSIFICATION extends AlbumLabelMode {
    val value = 0
    val index = 0
    val name = "CLASSIFICATION"
    override def isClassification: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object LOCALIZATION extends AlbumLabelMode {
    val value = 1
    val index = 1
    val name = "LOCALIZATION"
    override def isLocalization: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends AlbumLabelMode
  
  lazy val values = scala.collection.Seq(CLASSIFICATION, LOCALIZATION)
  def fromValue(value: Int): AlbumLabelMode = value match {
    case 0 => CLASSIFICATION
    case 1 => LOCALIZATION
    case __other => Unrecognized(__other)
  }
}