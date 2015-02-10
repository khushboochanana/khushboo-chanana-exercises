class Person 
{
String name
def age
def addr
String gen
}

Person p1= new Person()
p1.age=18
p1.setName("khushboo")

println p1.getName()
println p1.age

class Emp extends Person
{
    String compny
    int empid    
    int salary
    def getSalary (){
    if(salary>5000){
        println ("Salary greater than 5000")
        return salary 
        }
    else 
    {    
        println "salary less than 5000"
        return salary
    }
    }
    
    def getAge()
    {
        
        println "your age is "+age
    }
    
    
}
Emp e1= new Emp()
println e1.getName()
e1.setSalary(60000)
println e1.getSalary()
println e1.@salary
e1.setAge(25)
println e1.getAge()