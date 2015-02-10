import groovy.io.FileType
File latest= new File("l.txt")

new File('.').eachFile(FileType.FILES)
{
if(it.name.endsWith(".txt")){

println it

latest.append(it.text)
}
}
