List l=[1,2,3,4,5,6,7,8,9,10]
println l
l.each{
  if (it%2==0)
    l = l-it
}

    println "list after removing odd index elements    "+l
   
   