# DashboardBatch
Application that runs a batch job every 5 minutes to populate a sqlite database with information from XML. It also runs every midnight to delete old information.

The application use Spring Batch for the tasks and maven shade plugin to create an executable jar with spring and all its dependencies inside.
