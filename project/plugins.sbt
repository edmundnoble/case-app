resolvers += Resolver.url(
  "tpolecat-sbt-plugin-releases",
  url("http://dl.bintray.com/content/tpolecat/sbt-plugin-releases") )(
  Resolver.ivyStylePatterns
)

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.4.7")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.13")
addSbtPlugin("com.dwijnand" % "sbt-travisci" % "1.0.0-M4")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M15-1")
