object Main {
  def main(args: Array[String]): Unit = {

  }

  val tup=(1,2)
  println(tup)

  var list=Array.range(1,51,1)
  for ( x <- list ) {
    print( " " + x )
  };
println("")
  var cl1 : List[String]= List("nombre","direcçao","tlf","email" )
  var cl2 : List[String]= List("nombre2","direcçao2","tlf2","email2" )
var mapa: Map[Int, List[String]]=Map()
  mapa += (1->cl1)
  mapa += (2->cl2)

  println(mapa)


}
//calamares al ajillo
//features tal y cual barrabinbarrabashshsh
//sjgdfhajsgasbcdsbfnds