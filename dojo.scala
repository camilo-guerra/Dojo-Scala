import Array._
object dojo{
     def main(args: Array[String]) {
         //var sum1:Int = readLine().toInt
         //var sum2:Int = readLine().toInt
         println("el valor es_"+ dojo.suma(2,3))
         var array1 = new Array[Int](2)
			array1(0)=1
			array1(1)=2
            for(i <- 0 to (array1.length-1)){

            	println(array1(i))
            }

			var nombre = "Scala"
          println(array1(0))
          var matriz=ofDim[Int](2,2)
          for(i <- 0 to 1){
            for(j <- 0 to 1){
            	matriz(i)(j) = j*i
            	println(matriz(i)(j))
            }

          }
       // var sumaT= suma(sum1,sum2)
        //println("suma: "+ sumaT)
          var  array2 = ("Hola","Mundo")
          var array3=(1.2,1.4)
    }
    def suma(x:Int,y:Int)=x+y



}


//println("el valor es_"+ dojo.nombre)

