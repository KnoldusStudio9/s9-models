package cortex.api.job.album.augmentation

sealed trait GeneralParams {
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
  def rotationParams: scala.Option[cortex.api.job.album.augmentation.AppliedRotationParams] = None
  def shearingParams: scala.Option[cortex.api.job.album.augmentation.AppliedShearingParams] = None
  def noisingParams: scala.Option[cortex.api.job.album.augmentation.AppliedNoisingParams] = None
  def zoomInParams: scala.Option[cortex.api.job.album.augmentation.AppliedZoomInParams] = None
  def zoomOutParams: scala.Option[cortex.api.job.album.augmentation.AppliedZoomOutParams] = None
  def occlusionParams: scala.Option[cortex.api.job.album.augmentation.AppliedOcclusionParams] = None
  def translationParams: scala.Option[cortex.api.job.album.augmentation.AppliedTranslationParams] = None
  def saltPepperParams: scala.Option[cortex.api.job.album.augmentation.AppliedSaltPepperParams] = None
  def mirroringParams: scala.Option[cortex.api.job.album.augmentation.AppliedMirroringParams] = None
  def croppingParams: scala.Option[cortex.api.job.album.augmentation.AppliedCroppingParams] = None
  def blurringParams: scala.Option[cortex.api.job.album.augmentation.AppliedBlurringParams] = None
  def photometricDistortParams: scala.Option[cortex.api.job.album.augmentation.AppliedPhotometricDistortParams] = None
}
object GeneralParams extends {

  case object Empty extends GeneralParams {
    override def isEmpty: Boolean = true
    override def isDefined: Boolean = false
  }


  case class RotationParams(value: cortex.api.job.album.augmentation.AppliedRotationParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isRotationParams: Boolean = true
    override def rotationParams: scala.Option[cortex.api.job.album.augmentation.AppliedRotationParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class ShearingParams(value: cortex.api.job.album.augmentation.AppliedShearingParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isShearingParams: Boolean = true
    override def shearingParams: scala.Option[cortex.api.job.album.augmentation.AppliedShearingParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class NoisingParams(value: cortex.api.job.album.augmentation.AppliedNoisingParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isNoisingParams: Boolean = true
    override def noisingParams: scala.Option[cortex.api.job.album.augmentation.AppliedNoisingParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class ZoomInParams(value: cortex.api.job.album.augmentation.AppliedZoomInParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isZoomInParams: Boolean = true
    override def zoomInParams: scala.Option[cortex.api.job.album.augmentation.AppliedZoomInParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class ZoomOutParams(value: cortex.api.job.album.augmentation.AppliedZoomOutParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isZoomOutParams: Boolean = true
    override def zoomOutParams: scala.Option[cortex.api.job.album.augmentation.AppliedZoomOutParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class OcclusionParams(value: cortex.api.job.album.augmentation.AppliedOcclusionParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isOcclusionParams: Boolean = true
    override def occlusionParams: scala.Option[cortex.api.job.album.augmentation.AppliedOcclusionParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class TranslationParams(value: cortex.api.job.album.augmentation.AppliedTranslationParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isTranslationParams: Boolean = true
    override def translationParams: scala.Option[cortex.api.job.album.augmentation.AppliedTranslationParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class SaltPepperParams(value: cortex.api.job.album.augmentation.AppliedSaltPepperParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isSaltPepperParams: Boolean = true
    override def saltPepperParams: scala.Option[cortex.api.job.album.augmentation.AppliedSaltPepperParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class MirroringParams(value: cortex.api.job.album.augmentation.AppliedMirroringParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isMirroringParams: Boolean = true
    override def mirroringParams: scala.Option[cortex.api.job.album.augmentation.AppliedMirroringParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class CroppingParams(value: cortex.api.job.album.augmentation.AppliedCroppingParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isCroppingParams: Boolean = true
    override def croppingParams: scala.Option[cortex.api.job.album.augmentation.AppliedCroppingParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class BlurringParams(value: cortex.api.job.album.augmentation.AppliedBlurringParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isBlurringParams: Boolean = true
    override def blurringParams: scala.Option[cortex.api.job.album.augmentation.AppliedBlurringParams] = Some(value)
  }
  @SerialVersionUID(0L)
  case class PhotometricDistortParams(value: cortex.api.job.album.augmentation.AppliedPhotometricDistortParams) extends cortex.api.job.album.augmentation.GeneralParams {
    override def isPhotometricDistortParams: Boolean = true
    override def photometricDistortParams: scala.Option[cortex.api.job.album.augmentation.AppliedPhotometricDistortParams] = Some(value)
  }
}
