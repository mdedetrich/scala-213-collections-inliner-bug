# Scala 213 Collections Inliner Bug

To reproduce simply do `sbt clean` and then `sbt compile`. If you want to compare it to Scala 2.12
then do `sbt ++clean` and then `sbt "++2.12.17" compile` (the bug only appears in Scala 2.13).
