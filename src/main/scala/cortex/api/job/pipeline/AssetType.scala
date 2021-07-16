package cortex.api.job.pipeline

sealed trait AssetType {
  type EnumType = AssetType
  def isTabularModel: Boolean = false
  def isTabularPrediction: Boolean = false
  def isTable: Boolean = false
  def isFlow: Boolean = false
  def isAlbum: Boolean = false
  def isCvModel: Boolean = false
  def isCvPrediction: Boolean = false
  def isOnlineJob: Boolean = false
  def isDcproject: Boolean = false
  def isExperiment: Boolean = false
  def isPipeline: Boolean = false
}

object AssetType {
  @SerialVersionUID(0L)
  case object TabularModel extends AssetType {
    val value = 0
    val index = 0
    val name = "TabularModel"
    override def isTabularModel: Boolean = true
  }

  @SerialVersionUID(0L)
  case object TabularPrediction extends AssetType {
    val value = 1
    val index = 1
    val name = "TabularPrediction"
    override def isTabularPrediction: Boolean = true
  }

  @SerialVersionUID(0L)
  case object Table extends AssetType {
    val value = 2
    val index = 2
    val name = "Table"
    override def isTable: Boolean = true
  }

  @SerialVersionUID(0L)
  case object Flow extends AssetType {
    val value = 3
    val index = 3
    val name = "Flow"
    override def isFlow: Boolean = true
  }

  @SerialVersionUID(0L)
  case object Album extends AssetType {
    val value = 4
    val index = 4
    val name = "Album"
    override def isAlbum: Boolean = true
  }

  @SerialVersionUID(0L)
  case object CvModel extends AssetType {
    val value = 5
    val index = 5
    val name = "CvModel"
    override def isCvModel: Boolean = true
  }

  @SerialVersionUID(0L)
  case object CvPrediction extends AssetType {
    val value = 6
    val index = 6
    val name = "CvPrediction"
    override def isCvPrediction: Boolean = true
  }

  @SerialVersionUID(0L)
  case object OnlineJob extends AssetType {
    val value = 7
    val index = 7
    val name = "OnlineJob"
    override def isOnlineJob: Boolean = true
  }

  @SerialVersionUID(0L)
  case object DCProject extends AssetType {
    val value = 8
    val index = 8
    val name = "DCProject"
    override def isDcproject: Boolean = true
  }

  @SerialVersionUID(0L)
  case object Experiment extends AssetType {
    val value = 9
    val index = 9
    val name = "Experiment"
    override def isExperiment: Boolean = true
  }

  @SerialVersionUID(0L)
  case object Pipeline extends AssetType {
    val value = 10
    val index = 10
    val name = "Pipeline"
    override def isPipeline: Boolean = true
  }

  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends AssetType
  lazy val values = scala.collection.Seq(TabularModel, TabularPrediction, Table, Flow, Album, CvModel, CvPrediction, OnlineJob, DCProject, Experiment, Pipeline)
  def fromValue(value: Int): AssetType = value match {
    case 0 => TabularModel
    case 1 => TabularPrediction
    case 2 => Table
    case 3 => Flow
    case 4 => Album
    case 5 => CvModel
    case 6 => CvPrediction
    case 7 => OnlineJob
    case 8 => DCProject
    case 9 => Experiment
    case 10 => Pipeline
    case __other => Unrecognized(__other)
  }
}