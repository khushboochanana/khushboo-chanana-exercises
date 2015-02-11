class Stack 
{

List l =[]
def push1 (def element)
{
l.push(element)
}

def pop1()
{

l.pop()
}

def top ()
{
l.reverse().head()

}
}
Stack s=new Stack()
s.push1(9)
s.push1(25)
s.push1(2)
s.push1(20)

println s.l
println s.pop1()
println("stack after pop "+s.l)
println "top of the stack  "+s.top()