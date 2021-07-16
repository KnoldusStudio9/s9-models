package cortex.api.job.album.common


@SerialVersionUID(0L)
final case class Image(
                        filePath: String = "",
                        referenceId: scala.Option[String] = None,
                        fileSize: scala.Option[Long] = None,
                        displayName: scala.Option[String] = None
                      )
