package cortex.api.job.album.common

@SerialVersionUID(0L)
final case class Tag(
                      label: String = "",
                      area: scala.Option[cortex.api.job.album.common.TagArea] = None
                    )
