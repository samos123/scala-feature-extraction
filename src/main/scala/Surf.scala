import java.io.File

import org.bytedeco.javacpp.opencv_core._
import org.bytedeco.javacpp.opencv_imgcodecs._
import org.bytedeco.javacpp.opencv_imgproc._
import org.bytedeco.javacpp.opencv_features2d._
import org.bytedeco.javacpp.opencv_xfeatures2d._


/**
 * Example of extracting SURF features from section "Detecting the scale-invariant SURF features" in chapter 8.
 */
object Ex5SURF extends App {

  // Read input image
  val image = imread("test.jpg")

  // Detect SURF features.
  val keyPoints = new KeyPointVector()
  val descriptors = new Mat()
  val hessianThreshold = 2500d
  val nOctaves = 4
  val nOctaveLayers = 2
  val extended = true
  val upright = false
  val surf = SURF.create(hessianThreshold, nOctaves, nOctaveLayers, extended, upright)
  // The 2nd param "mask" is set to empty Mat()
  surf.detectAndCompute(image, new Mat(), keyPoints, descriptors, false)
  println(descriptors)

  // Draw keyPoints
  //    val featureImage = cvCreateImage(cvGetSize(image), image.depth(), 3)
}
