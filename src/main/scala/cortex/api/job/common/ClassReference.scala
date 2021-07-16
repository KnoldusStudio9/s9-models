package cortex.api.job.common

@SerialVersionUID(0L)
final case class ClassReference(
    packageLocation: scala.Option[String] = None,
    className: String = "",
    moduleName: String = ""
    )