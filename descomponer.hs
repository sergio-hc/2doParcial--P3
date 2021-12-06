--Descomponer la misma en palabras y otra en letras
--Sergio Luis Huanca Cuellar
--INF -319 2do Parcial
--Pregunta 3

-- funcion divide por palabras
wordsWhen     :: (Char -> Bool) -> String -> [String]
wordsWhen p s =  case dropWhile p s of
                      "" -> []
                      s' -> w : wordsWhen p s''
                            where (w, s'') = break p s'

 

--frase
frase = "Hola a todos y gradias"
--ejecuta la funcion 
main1 = print $ wordsWhen (==' ') frase


--la frase ya esta dividio por letras es decir ya es una lista de char por defecto
--funcion mostrar una letra en una posicion
mostrar_ubicacion::Ord a=>[a]->Int->a
mostrar_ubicacion l n = l!!n

main2 = mostrar_ubicacion frase 2 -- muestra posicion 2 de la lista