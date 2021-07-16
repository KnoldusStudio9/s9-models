package cortex.api.job.table

final case class ColumnStatistics(
    columnName: String = "",
    statistics: Statistics = Statistics.Empty
    )

