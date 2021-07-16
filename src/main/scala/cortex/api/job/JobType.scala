package cortex.api.job


sealed trait JobType {
  type EnumType = JobType
  def isCvmodelTrain: Boolean = false
  def isCvpredict: Boolean = false
  def isCvevaluate: Boolean = false
  def isTabularTrain: Boolean = false
  def isTabularPredict: Boolean = false
  def isS3ImagesImport: Boolean = false
  def isTabularEvaluate: Boolean = false
  def isOnlinePrediction: Boolean = false
  def isS3VideoImport: Boolean = false
  def isTabularUpload: Boolean = false
  def isAlbumAugmentation: Boolean = false
  def isTabularColumnStatistics: Boolean = false
  def isCvmodelImport: Boolean = false
  def isProjectPackage: Boolean = false
  def isTabularModelImport: Boolean = false
  def isPipeline: Boolean = false
  def isS3DatasetImport: Boolean = false
  def isS3DatasetExport: Boolean = false
}

object JobType{
  @SerialVersionUID(0L)
  case object CVModelTrain extends JobType {
    val value = 0
    val index = 0
    val name = "CVModelTrain"
    override def isCvmodelTrain: Boolean = true
  }

  @SerialVersionUID(0L)
  case object CVPredict extends JobType {
    val value = 1
    val index = 1
    val name = "CVPredict"
    override def isCvpredict: Boolean = true
  }

  @SerialVersionUID(0L)
  case object CVEvaluate extends JobType {
    val value = 2
    val index = 2
    val name = "CVEvaluate"
    override def isCvevaluate: Boolean = true
  }

  @SerialVersionUID(0L)
  case object TabularTrain extends JobType {
    val value = 4
    val index = 3
    val name = "TabularTrain"
    override def isTabularTrain: Boolean = true
  }

  @SerialVersionUID(0L)
  case object TabularPredict extends JobType {
    val value = 5
    val index = 4
    val name = "TabularPredict"
    override def isTabularPredict: Boolean = true
  }

  @SerialVersionUID(0L)
  case object S3ImagesImport extends JobType {
    val value = 6
    val index = 5
    val name = "S3ImagesImport"
    override def isS3ImagesImport: Boolean = true
  }

  @SerialVersionUID(0L)
  case object TabularEvaluate extends JobType {
    val value = 7
    val index = 6
    val name = "TabularEvaluate"
    override def isTabularEvaluate: Boolean = true
  }

  @SerialVersionUID(0L)
  case object OnlinePrediction extends JobType {
    val value = 8
    val index = 7
    val name = "OnlinePrediction"
    override def isOnlinePrediction: Boolean = true
  }

  @SerialVersionUID(0L)
  case object S3VideoImport extends JobType {
    val value = 11
    val index = 8
    val name = "S3VideoImport"
    override def isS3VideoImport: Boolean = true
  }

  @SerialVersionUID(0L)
  case object TabularUpload extends JobType {
    val value = 15
    val index = 9
    val name = "TabularUpload"
    override def isTabularUpload: Boolean = true
  }

  @SerialVersionUID(0L)
  case object AlbumAugmentation extends JobType {
    val value = 17
    val index = 10
    val name = "AlbumAugmentation"
    override def isAlbumAugmentation: Boolean = true
  }

  @SerialVersionUID(0L)
  case object TabularColumnStatistics extends JobType {
    val value = 18
    val index = 11
    val name = "TabularColumnStatistics"
    override def isTabularColumnStatistics: Boolean = true
  }

  @SerialVersionUID(0L)
  case object CVModelImport extends JobType {
    val value = 19
    val index = 12
    val name = "CVModelImport"
    override def isCvmodelImport: Boolean = true
  }

  @SerialVersionUID(0L)
  case object ProjectPackage extends JobType {
    val value = 20
    val index = 13
    val name = "ProjectPackage"
    override def isProjectPackage: Boolean = true
  }

  @SerialVersionUID(0L)
  case object TabularModelImport extends JobType {
    val value = 21
    val index = 14
    val name = "TabularModelImport"
    override def isTabularModelImport: Boolean = true
  }

  @SerialVersionUID(0L)
  case object Pipeline extends JobType {
    val value = 22
    val index = 15
    val name = "Pipeline"
    override def isPipeline: Boolean = true
  }

  @SerialVersionUID(0L)
  case object S3DatasetImport extends JobType {
    val value = 23
    val index = 16
    val name = "S3DatasetImport"
    override def isS3DatasetImport: Boolean = true
  }

  @SerialVersionUID(0L)
  case object S3DatasetExport extends JobType {
    val value = 24
    val index = 17
    val name = "S3DatasetExport"
    override def isS3DatasetExport: Boolean = true
  }

  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends JobType

  lazy val values = scala.collection.Seq(CVModelTrain, CVPredict, CVEvaluate, TabularTrain, TabularPredict, S3ImagesImport, TabularEvaluate, OnlinePrediction, S3VideoImport, TabularUpload, AlbumAugmentation, TabularColumnStatistics, CVModelImport, ProjectPackage, TabularModelImport, Pipeline, S3DatasetImport, S3DatasetExport)
  def fromValue(value: Int): JobType = value match {
    case 0 => CVModelTrain
    case 1 => CVPredict
    case 2 => CVEvaluate
    case 4 => TabularTrain
    case 5 => TabularPredict
    case 6 => S3ImagesImport
    case 7 => TabularEvaluate
    case 8 => OnlinePrediction
    case 11 => S3VideoImport
    case 15 => TabularUpload
    case 17 => AlbumAugmentation
    case 18 => TabularColumnStatistics
    case 19 => CVModelImport
    case 20 => ProjectPackage
    case 21 => TabularModelImport
    case 22 => Pipeline
    case 23 => S3DatasetImport
    case 24 => S3DatasetExport
    case __other => Unrecognized(__other)
  }
}
