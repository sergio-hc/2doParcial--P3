//Descomponer una frase en palabras y letras
//Sergio Luis Huanca Cuellar
//Segundo Parcial - problema 3

object descomponer {
var d: Array[String] = new Array[String](15)
var e: Array[Char] = new Array[Char](30)

//funcion descomponer en palabras
def desc1 (a:String): Array[String]= {
  d = a.split(" ")
  return d
}

//funcion descomponer en letras
def desc2 (a: String): Array[Char]={
  e = a.toCharArray()
  return e
}
  
//funcion mostrar array-string
def mostrar1(x: Array[String]) =
   for ( i <-0 to x.length-1 ) {
         print( x(i) + ",")
      }

//funcion mostrar array-char
def mostrar2(x: Array[Char]) =
   for ( i <-0 to x.length-1 ) {
         print( x(i) +"," )
      }

def main(args: Array[String]):Unit = {
  println("****DESCOMPONER EN PALABRAS Y LETRAS EN SCALA*********")
  //La frase lo guaradamos en una variable
  val frase = "HOla a todos como estan"
  println("La frase es: "+ frase)
  println("DESCOMPONER UNA FRASE EN PALABRAS...")
  //llamamos a la funcion desc1
  d = desc1(frase)
  mostrar1(d)
  println("\nDESCOMPONER UNA FRASE EN LETRAS...")
  //llamamos a la funcion desc2
  e = desc2(frase)
  mostrar2(e)
}
}