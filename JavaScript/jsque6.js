function validate(){
	var n=document.getElementById("t1").value;
	var a=document.getElementById("t2").value;
	if(n.length==0)
	alert("this field cannot b left blank !!Please Enter name");
	if(!isNaN(n))
	alert("Enter valid name");
	
	 if(a.length==0)
	alert("this field cannot b left blank !!Please Enter age");
	 if(isNaN(a))
	alert("Enter the number ");
	 if(a<18)
	alert("Invalid age !! Enter age >18");	
	
	
}
