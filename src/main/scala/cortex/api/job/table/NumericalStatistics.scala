package cortex.api.job.table

final case class NumericalStatistics(
                                      min: Double = 0.0,
                                      max: Double = 0.0,
                                      avg: Double = 0.0,
                                      std: Double = 0.0,
                                      stdPopulation: Double = 0.0,
                                      mean: Double = 0.0,
                                      histogram: scala.Option[cortex.api.job.table.NumericalHistogram] = None
                                    )