name := "scala-213-collections-inliner-bug"
scalaVersion := "2.13.10"
crossScalaVersions := Seq("2.13.10", "2.12.17")

scalacOptions ++= Seq(
  "-opt-inline-from:<sources>",
  "-opt:l:inline"
)

ThisBuild / scalacOptions ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, n)) if n == 13 =>
      Seq("-Wopt:any-inline-failed")
    case Some((2, n)) if n == 12 =>
      Nil
  }
}
