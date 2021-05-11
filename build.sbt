lazy val commonSettings = Seq(
  target := { baseDirectory.value / "target2" }
)

lazy val api = (project in file("api"))
  .settings(
    commonSettings
  )

lazy val advisor = (project in file("advisor"))
  .settings(
    commonSettings,
    // other settings
  )
  .dependsOn(api)

lazy val sponsor = (project in file("sponsor"))
  .settings(
    commonSettings,
    // other settings
  )
  .dependsOn(api)

lazy val root = (project in file("."))
  .aggregate(advisor, sponsor)

