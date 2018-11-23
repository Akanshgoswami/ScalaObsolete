package cdac.scala.assignment



class empStructure extends orgBehaviour with organisation {

  val orbhv= new orgBehaviour

    def orgStructure(id:String,name:String,deptId:Int,basic:Double):Unit={
    println(orbhv.getId(id))
    println(orbhv.getDetails(id,name,deptId,basic))
    }


}
