class HourMinute{

int hour,min 
HourMinute plus(HourMinute h)
{
HourMinute h1= new HourMinute(hour: (hour + [hour]),min :(min +[min]))
if(h1.min >= 60)
{
h1.min-= 60
h1.hour++
}

return h1
}
String toString(){
hour+":"+min
}
}

HourMinute h1= new HourMinute()
HourMinute h2= new HourMinute()

h1.min=50

h1.hour=2

h2.hour=2
h2.min=20
HourMinute h3 = h1+h2
