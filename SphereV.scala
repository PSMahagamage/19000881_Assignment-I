import scala.math.pow

object SphereV extends App{
  def volume(r:Double):Double=(4.0/3.0)*math.Pi*pow(r,3);

  println("Volume of the sphere with radius 5 is = "+volume(5) );
}
