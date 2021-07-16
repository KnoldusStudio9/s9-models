package cortex.api.job.project.`package`

@SerialVersionUID(0L)
final case class ProjectPackageRequest(
                                        projectFilesPath: String = "",
                                        name: String = "",
                                        version: String = "",
                                        targetPrefix: String = ""
                                      )