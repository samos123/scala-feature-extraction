name := "opencv2-scala-test"
organization := "samos"


libraryDependencies ++= Seq(
  "de.lmu.ifi.dbs.jfeaturelib" % "JFeatureLib" % "1.6.3" from "https://oss.sonatype.org/content/repositories/releases/de/lmu/ifi/dbs/jfeaturelib/JFeatureLib/1.6.3/JFeatureLib-1.6.3.jar",
  "gov.nih.imagej" % "imagej" % "1.46"
)
