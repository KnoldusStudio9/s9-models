package cortex.api.job.table

@SerialVersionUID(0L)
final case class NumericalHistogramRow(
                                        min: Double = 0.0,
                                        max: Double = 0.0,
                                        count: Long = 0L
                                      )