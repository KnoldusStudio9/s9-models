package cortex.api.job.album.augmentation

sealed trait Params {
  def isEmpty: Boolean = false
  def isDefined: Boolean = true
  def isRotationParams: Boolean = false
  def isShearingParams: Boolean = false
  def isNoisingParams: Boolean = false
  def isZoomInParams: Boolean = false
  def isZoomOutParams: Boolean = false
  def isOcclusionParams: Boolean = false
  def isTranslationParams: Boolean = false
  def isSaltPepperParams: Boolean = false
  def isMirroringParams: Boolean = false
  def isCroppingParams: Boolean = false
  def isBlurringParams: Boolean = false
  def isPhotometricDistortParams: Boolean = false
  def rotationParams: scala.Option[cortex.api.job.album.augmentation.RotationRequestParams] = None
  def shearingParams: scala.Option[cortex.api.job.album.augmentation.ShearingRequestParams] = None
  def noisingParams: scala.Option[cortex.api.job.album.augmentation.NoisingRequestParams] = None
  def zoomInParams: scala.Option[cortex.api.job.album.augmentation.ZoomInRequestParams] = None
  def zoomOutParams: scala.Option[cortex.api.job.album.augmentation.ZoomOutRequestParams] = None
  def occlusionParams: scala.Option[cortex.api.job.album.augmentation.OcclusionRequestParams] = None
  def translationParams: scala.Option[cortex.api.job.album.augmentation.TranslationRequestParams] = None
  def saltPepperParams: scala.Option[cortex.api.job.album.augmentation.SaltPepperRequestParams] = None
  def mirroringParams: scala.Option[cortex.api.job.album.augmentation.MirroringRequestParams] = None
  def croppingParams: scala.Option[cortex.api.job.album.augmentation.CroppingRequestParams] = None
  def blurringParams: scala.Option[cortex.api.job.album.augmentation.BlurringRequestParams] = None
  def photometricDistortParams: scala.Option[cortex.api.job.album.augmentation.PhotometricDistortRequestParams] = None
}
object Params extends {
  @SerialVersionUID(0L)
  case object Empty extends cortex.api.job.album.augmentation.Params {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }

  @SerialVersionUID(0L)
  case class RotationParams(value: cortex.api.job.album.augmentation.RotationRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isRotationParams: Boolean = true
    override def rotationParams: scala.Option[cortex.api.job.album.augmentation.RotationRequestParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class ShearingParams(value: cortex.api.job.album.augmentation.ShearingRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isShearingParams: Boolean = true
    override def shearingParams: scala.Option[cortex.api.job.album.augmentation.ShearingRequestParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class NoisingParams(value: cortex.api.job.album.augmentation.NoisingRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isNoisingParams: Boolean = true
    override def noisingParams: scala.Option[cortex.api.job.album.augmentation.NoisingRequestParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class ZoomInParams(value: cortex.api.job.album.augmentation.ZoomInRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isZoomInParams: Boolean = true
    override def zoomInParams: scala.Option[cortex.api.job.album.augmentation.ZoomInRequestParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class ZoomOutParams(value: cortex.api.job.album.augmentation.ZoomOutRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isZoomOutParams: Boolean = true
    override def zoomOutParams: scala.Option[cortex.api.job.album.augmentation.ZoomOutRequestParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class OcclusionParams(value: cortex.api.job.album.augmentation.OcclusionRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isOcclusionParams: Boolean = true
    override def occlusionParams: scala.Option[cortex.api.job.album.augmentation.OcclusionRequestParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class TranslationParams(value: cortex.api.job.album.augmentation.TranslationRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isTranslationParams: Boolean = true
    override def translationParams: scala.Option[cortex.api.job.album.augmentation.TranslationRequestParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class SaltPepperParams(value: cortex.api.job.album.augmentation.SaltPepperRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isSaltPepperParams: Boolean = true
    override def saltPepperParams: scala.Option[cortex.api.job.album.augmentation.SaltPepperRequestParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class MirroringParams(value: cortex.api.job.album.augmentation.MirroringRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isMirroringParams: Boolean = true
    override def mirroringParams: scala.Option[cortex.api.job.album.augmentation.MirroringRequestParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class CroppingParams(value: cortex.api.job.album.augmentation.CroppingRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isCroppingParams: Boolean = true
    override def croppingParams: scala.Option[cortex.api.job.album.augmentation.CroppingRequestParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class BlurringParams(value: cortex.api.job.album.augmentation.BlurringRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isBlurringParams: Boolean = true
    override def blurringParams: scala.Option[cortex.api.job.album.augmentation.BlurringRequestParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class PhotometricDistortParams(value: cortex.api.job.album.augmentation.PhotometricDistortRequestParams) extends cortex.api.job.album.augmentation.Params {
    override def isPhotometricDistortParams: Boolean = true
    override def photometricDistortParams: scala.Option[cortex.api.job.album.augmentation.PhotometricDistortRequestParams] = Some(value)
  }
}