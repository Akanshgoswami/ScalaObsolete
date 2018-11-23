//println("Hello")
//
//val d= (1,"AKansh")
//println(d)
//
//d.productIterator.foreach(println)
//println(d._2)

//List

val lst=List(1,2,3,4,5)
lst:+(6)
println(lst.forall(x=>x<5))
println(lst.exists(y=>y<3))
println(lst.filter(y=>y==2).size)
lst.foreach(y=>println("ListElement"+y))

def fi(x:Int):Boolean={
 x%2!=0
}
lst.filter(x=>(fi(x))).size