Map m=["computing":["computing":600,"infoSystem":300],"engg":["civil":200,"mecnical":100],"mgt":["mgt":100]]
println "department  "+m.count{it.key}
println "computing dept "+m.get("computing").count{it.key}
println "Student enrolled in civil "+ m.get("engg").civil