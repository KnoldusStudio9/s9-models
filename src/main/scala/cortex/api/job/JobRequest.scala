package cortex.api.job

@SerialVersionUID(0L)
final case class JobRequest(
                             `type`: cortex.api.job.JobType = cortex.api.job.JobType.CVModelTrain,
                             payload: String= ""
                           )
